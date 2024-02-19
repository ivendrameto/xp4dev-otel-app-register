package dev.xp4.article.controller;


import dev.xp4.article.dto.RegisterDTO;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import dev.xp4.article.service.RegisterService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/registers")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService service;

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<RegisterDTO> find(@RequestParam Map<String, String> allFilters) {
        return service.find(allFilters);
    }

    @PostMapping(value = "/car")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterDTO registerCar(@RequestBody RegisterDTO dto) {
        return service.registerCar(dto);
    }

    @PostMapping(value = "/client")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterDTO registerClient(@RequestBody RegisterDTO dto) {
        return service.registerClient(dto);
    }

}

package dev.xp4.article.service;

import dev.xp4.article.client.Xp4DevApiCar;
import dev.xp4.article.client.Xp4DevApiClient;
import dev.xp4.article.client.response.CarResponse;
import dev.xp4.article.client.response.ClientResponse;
import dev.xp4.article.dto.RegisterDTO;
import dev.xp4.article.mapper.RegisterMapper;

import dev.xp4.article.persistence.entity.Register;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import dev.xp4.article.persistence.repository.RegisterRepository;

import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterService {

    private final RegisterRepository repository;
    private final RegisterMapper mapper;

    private final Xp4DevApiCar apiCar;
    private final Xp4DevApiClient apiClient;

    public List<RegisterDTO> find(Map<String, String> allFilters) {
        List<Register> list = repository.findAll();
        return mapper.toListDTO(list);
    }

    public RegisterDTO registerCar(RegisterDTO dto) {
        CarResponse response = apiCar.findById(dto.getCarId());

        Register register = Register.builder()
            .carId(response.getId())
            .registerDateTime(LocalDateTime.now())
            .build();

        register = repository.save(register);
        return mapper.toDTO(register);
    }
    public RegisterDTO registerClient(RegisterDTO dto) {
        ClientResponse response = apiClient.findById(dto.getClientId());

        Register register = Register.builder()
            .clientId(response.getId())
            .registerDateTime(LocalDateTime.now())
            .build();

        register = repository.save(register);
        return mapper.toDTO(register);
    }

}

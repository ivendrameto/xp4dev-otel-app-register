package dev.xp4.article.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.xp4.article.client.response.CarResponse;

@FeignClient(
    name = "apiCar",
    value = "apiCar",
    url = "${xp4dev.api-car.url}"
)
public interface Xp4DevApiCar {

    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/cars",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    List<CarResponse> findAll();

    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/cars/{id}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    CarResponse findById(@PathVariable("id") Long id);

}

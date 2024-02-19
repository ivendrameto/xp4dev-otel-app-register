package dev.xp4.article.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.xp4.article.client.response.ClientResponse;

@FeignClient(
    name = "apiClient",
    value = "apiClient",
    url = "${xp4dev.api-client.url}"
)
public interface Xp4DevApiClient {

    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/clients",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    List<ClientResponse> findAll();

    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/clients/{id}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    ClientResponse findById(@PathVariable("id") Long id);

}

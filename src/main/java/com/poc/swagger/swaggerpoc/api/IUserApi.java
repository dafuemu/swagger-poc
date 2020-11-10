package com.poc.swagger.swaggerpoc.api;


import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("api")
public interface IUserApi {

  @ApiResponse(responseCode = "200", description = "This is ok indeed" )
  @GetMapping("/users/{id}")
  Mono<String> getUser(@PathVariable long id);
}

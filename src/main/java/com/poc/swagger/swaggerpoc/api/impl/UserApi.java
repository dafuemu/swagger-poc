package com.poc.swagger.swaggerpoc.api.impl;

import com.poc.swagger.swaggerpoc.api.IUserApi;
import reactor.core.publisher.Mono;


public class UserApi implements IUserApi {

  @Override
  public Mono<String> getUser(long id) {
    return Mono.just("Hello Docs");
  }
}

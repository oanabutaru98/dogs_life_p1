package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {

  @Autowired
  private DogService dogService;

  @GetMapping("/status")
  public String getWelcome() {
    return "Dogs API is up and running!";
  }

}

package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DogsController {

  private final DogService dogService;

  @Autowired
  public DogsController(DogService dogService) {
    this.dogService = dogService;
  }

  @GetMapping("/status")
  public String getWelcome() {
    return "Dogs API is up and running!";
  }

  @GetMapping("/dogs/count")
  public long getCountAllDogs(){
    return dogService.getNoOfDogs();
  }

  @GetMapping("/dogs")
  public List<Dog> getAllDogs(){
    return dogService.getAllDogs();
  }

  @GetMapping("/dogs/id/{id}")
  public Dog getDogById(@PathVariable Long id){
    return dogService.getDogById(id);
  }

  @GetMapping("/dogs/name/{name}")
  public Dog getDogByName(@PathVariable String name){
    return dogService.getDogByName(name);
  }
}

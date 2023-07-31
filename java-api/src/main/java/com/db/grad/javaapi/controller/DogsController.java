package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
public class DogsController {

  private final DogService dogService;

  @Autowired
  public DogsController(DogService dogService) {
    this.dogService = dogService;
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

  @PutMapping("/dogs/{id}")
  public ResponseEntity updateDog(@PathVariable Long id, @RequestBody Dog dogToUpdateInfo) {
    Dog dogToUpdate = new Dog();

    try {
      dogToUpdate = getDogById(id);
    } catch(NoSuchElementException e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND)
              .body("The dog with the id " + id + " does not exist!");
    }

    dogToUpdate.setId(id);
    dogToUpdate.setName(dogToUpdateInfo.getName());
    dogToUpdate.setAge(dogToUpdateInfo.getAge());
    dogService.updateDogDetails(dogToUpdate);

    return ResponseEntity.status(HttpStatus.OK)
            .body(dogToUpdate);
  }

  @PostMapping("/dogs")
  public ResponseEntity<Dog> addDog(@RequestBody Dog dogToCreate) {
    Dog addedDog = dogService.addDog(dogToCreate);

    return new ResponseEntity<Dog>(addedDog, HttpStatus.CREATED);
  }

  @DeleteMapping("/dogs/{id}")
  public Map<String, Boolean> deleteDog(@PathVariable Long id) {
    boolean deleted = dogService.removeDog(id);

    Map<String, Boolean> response = new HashMap<>();
    if(deleted)
      response.put("deleted", Boolean.TRUE);
    else
      response.put("deleted", Boolean.FALSE);

    return response;
  }
}

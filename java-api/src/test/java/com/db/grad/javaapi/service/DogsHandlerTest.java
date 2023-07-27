package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogsHandlerTest {

    private DogsRepository dogsRepository = new DogsRepositoryStub();

    @BeforeEach
    public void makeSureRepoIsEmpty() {
        dogsRepository.deleteAll();
    }

    @Test
    @DisplayName("add one dog in repository and test size")
    public void addDogReturnNumberOfDogsInRepoIsOne() {
        //arrange
        DogHandler dogHandler = new DogHandler(dogsRepository);
        Dog dog = new Dog();
        dog.setName("Bruno");
        dogHandler.addDog(dog);

        int expectedResult = 1;

        //act
        long actualResult = dogHandler.getNoOfDogs();

        //assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Test Adding Several Dogs")
    public void add_several_dogs_return_number_of_dogs_match_number_added() {
        // arrange
        DogHandler dogHandler = new DogHandler(dogsRepository);
        Dog dog1 = new Dog();
        dog1.setName("Bruno");
        Dog dog2 = new Dog();
        dog2.setName("Alex");
        Dog dog3 = new Dog();
        dog2.setName("Max");

        dogHandler.addDog(dog1);
        dogHandler.addDog(dog2);
        dogHandler.addDog(dog3);

        int expectedResult = 3;

        //act
        long actualResult = dogHandler.getNoOfDogs();

        //assert
        assertEquals(expectedResult, actualResult);
    }


}

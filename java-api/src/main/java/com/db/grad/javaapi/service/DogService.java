package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService implements IDogsService
{
    private final DogsRepository itsDogsRepo;

    @Autowired
    public DogService(DogsRepository dogsRepo) {
        this.itsDogsRepo = dogsRepo;
    }

    @Override
    public List<Dog> getAllDogs()
    {
        return itsDogsRepo.findAll();
    }

    @Override
    public Dog addDog(Dog theDog)
    {
        return itsDogsRepo.save(theDog);
    }

    @Override
    public long getNoOfDogs()
    {
        return itsDogsRepo.count();
    }

    @Override
    public boolean removeDog(long uniqueId)
    {
        boolean result = false;

        Optional<Dog> theDog = itsDogsRepo.findById(uniqueId);
        if(theDog.isPresent())
        {
            itsDogsRepo.delete(theDog.get());
            result = true;
        }

        return result;
    }

    @Override
    public Dog getDogById(long uniqueId)
    {
        return itsDogsRepo.findById(uniqueId).get();
    }

    @Override
    public Dog getDogByName(String dogsName)
    {
        List<Dog> dogs = itsDogsRepo.findByName(dogsName);
        Dog result = null;

        if( dogs.size() == 1)
            result = dogs.get(0);

        return result;
    }

    @Override
    public Dog updateDogDetails(Dog dogToUpdate)
    {
        return itsDogsRepo.save(dogToUpdate);
    }
}

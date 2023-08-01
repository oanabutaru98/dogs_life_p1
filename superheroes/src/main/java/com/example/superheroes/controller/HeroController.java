package com.example.superheroes.controller;

import com.example.superheroes.model.Hero;
import com.example.superheroes.service.HeroService;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HeroController {
    @Autowired
    HeroService heroService;

    @GetMapping("/heroes")
    public List<Hero> getAllHeroes() {
        return heroService.getAllHeroes();
    }

    @GetMapping("/heroes/{id}")
    public ResponseEntity<Hero> getHeroById(@PathVariable Integer id) {
        Optional<Hero> heroById = heroService.getHeroById(id);
        if (heroById.isEmpty()) {
            return (ResponseEntity<Hero>) ResponseEntity.notFound();
        }
        else {
            return ResponseEntity.of(heroById);
        }
    }

    @GetMapping("/heroesByLetter/{letter}")
    public ResponseEntity<List<Hero>> getHeroesStartingWithLetter(@PathVariable String letter) {
        if (letter.length() > 1) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(heroService.getHeroesStartingWithLetter(letter));
    }
    @PostMapping("/heroes")
    public HttpStatus saveNewHero(Hero newHero) {
        Hero createdHero = heroService.saveNewHero(newHero);
        if (createdHero != null) {
            return HttpStatus.CREATED;
        } else return HttpStatus.PRECONDITION_FAILED;
    }
}

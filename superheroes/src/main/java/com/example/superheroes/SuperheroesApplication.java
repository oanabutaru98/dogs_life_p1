package com.example.superheroes;

import com.example.superheroes.model.Hero;
import com.example.superheroes.practice.Calculator;
import com.example.superheroes.repository.HeroRepository;
import com.example.superheroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SuperheroesApplication implements CommandLineRunner {

//	@Autowired
//	Calculator calculator;
//	@Autowired
//	HeroRepository heroRepository;
	@Autowired
	HeroService heroService;
	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//List<Hero> heroes = heroRepository.findAll();
		//List<Hero> heroes = heroRepository.findTop3ByOrderByNameDesc();
		//List<Hero> heroes = heroRepository.findHeroesNameStartingWithLetter("d%");
		//List<Hero> heroes = heroService.getHeroesStartingWithLetter("c");
		//List<Hero> heroes = heroService.getAllHeroes();
		List<Hero> heroes = heroService.getLast3HeroesByName();
		for (Hero hero : heroes) {
			System.out.println(hero);
		}
//		System.out.println("hello world");
//		int result = calculator.addition(1,2);
//		System.out.println(result);
	}
}

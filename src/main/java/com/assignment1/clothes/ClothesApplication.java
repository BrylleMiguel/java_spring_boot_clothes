package com.assignment1.clothes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.assignment1.clothes.model.Clothe;
import com.assignment1.clothes.repository.ClotheRepository;

@SpringBootApplication
public class ClothesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClothesApplication.class, args);

	}

	@Bean
	CommandLineRunner dataRunner(ClotheRepository clotheRepository) {
		return args -> clotheRepository.save(Clothe
				.builder()
				.name("Polo Shirt")
				.price(13.99)
				.yearOfCreation(2022)
				.brand("Nike")
				.build());
	}
}

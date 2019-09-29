package com.company.pokemoncatchergen2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PokemonCatcherGen2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonCatcherGen2ServiceApplication.class, args);
	}

}

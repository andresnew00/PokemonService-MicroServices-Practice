package com.company.pokemoncatcherallgenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PokemonCatcherAllgenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonCatcherAllgenServiceApplication.class, args);
	}

}

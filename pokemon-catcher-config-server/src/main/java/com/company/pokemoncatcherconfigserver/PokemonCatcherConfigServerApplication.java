package com.company.pokemoncatcherconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// allows the application to communicate with other applications
@EnableConfigServer
public class PokemonCatcherConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonCatcherConfigServerApplication.class, args);
	}

}

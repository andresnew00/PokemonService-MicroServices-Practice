package com.company.pokemoncatcherserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// this turns this application into our eureka service registry
// gives the application access to the ureka dependencies
@EnableEurekaServer
public class PokemonCatcherServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonCatcherServiceRegistryApplication.class, args);
	}

}

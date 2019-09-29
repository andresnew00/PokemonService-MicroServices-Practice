package com.company.pokemoncatcherservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// this is used to force a bean to refresh
@RefreshScope
public class PokemonCatcherController {

    //this annotation will allow us to read a value from the configuration file
    @Value("${pokemonGen1}")
    private String pokemonsG1;

    @GetMapping(value = "/pokemong1")
    public String catchPokemonGen1() {

        String[] pokemonArray = pokemonsG1.split(",");

        int randomIndex = (int) (Math.random() * pokemonArray.length);
        return pokemonArray[randomIndex];

    }

}

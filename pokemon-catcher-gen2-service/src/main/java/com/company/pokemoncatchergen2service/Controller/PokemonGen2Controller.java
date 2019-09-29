package com.company.pokemoncatchergen2service.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PokemonGen2Controller {

    @Value("${pokemonGen2}")
    private String pokemonGen2;

    @GetMapping(value = "/pokemong2")
    public String getPokemonGen2(){

        String[] pokemonArr2 = pokemonGen2.split(",");

        int randomPokemonIndex =  (int) (Math.random() * pokemonArr2.length);

        return pokemonArr2[randomPokemonIndex];
    }
}

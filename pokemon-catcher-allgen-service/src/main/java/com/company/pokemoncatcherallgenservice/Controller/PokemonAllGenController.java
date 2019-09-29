package com.company.pokemoncatcherallgenservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RefreshScope
public class PokemonAllGenController {

    @Autowired
    private DiscoveryClient discoveryClient;

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${gen1PokemonService}")
    private String gen1PokemonService;

    @Value("${gen2PokemonService}")
    private String gen2PokemonService;

    //not in use
    @Value("${Title}")
    private String Title;

    @Value("${serviceProtocol}")
    private String serviceProtocol;

    @Value("${servicePath1}")
    private String servicePath1;

    @Value("${servicePath2}")
    private String servicePath2;

    public String UriServicePokemon(String serviceName, String path) {
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);

        String randomPokemonServiceUri =
                serviceProtocol + instances.get(0).getHost() + ":" + instances.get(0).getPort() + path;

        return restTemplate.getForObject(randomPokemonServiceUri, String.class);
    }

    @GetMapping("/randompokemon")
    public String getPokemonFromAnyGen() {
        int randomGeneration = (int) (Math.random() * 2);

        if(randomGeneration == 1) {
            return UriServicePokemon(gen1PokemonService,servicePath1);
        } else {
            return UriServicePokemon(gen2PokemonService,servicePath2);
        }
    }


}

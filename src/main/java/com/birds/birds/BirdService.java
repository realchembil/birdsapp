package com.birds.birds;

import com.birds.birds.rest.Bird;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BirdService {
    private final WebClient webClient;

    public BirdService(WebClient.Builder builder){

        webClient = builder.baseUrl("https://api.ebird.org/v2/").build();
    }

    public Bird[] getBirds(){
        return webClient.get().uri("/data/obs/IN-KL-TS/recent")
                .header("X-eBirdApiToken","XXX")
                .retrieve()
                .bodyToMono(Bird[].class).block();

    }

}

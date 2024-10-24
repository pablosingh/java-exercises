package com.dos.portfolio.requestexternalapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.dos.portfolio.apirespmodel.Apiresponsemodel;
import com.dos.portfolio.apirespmodel.Data;

import reactor.core.publisher.Flux;

@Service
public class ApiService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Flux<String> getExternalData() {
        String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
        return webClientBuilder.build()
                .get()
                .uri(url)
                .header("Content-Type", "application/json")
                .header("X-CMC_PRO_API_KEY", "6b555911-d0f2-417f-9bd1-95cf5ea375aa")
                .retrieve()
                .bodyToFlux(String.class);
    }

    public Flux<Data> getExternalDataDeserialized() {
        String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
        return webClientBuilder.build()
                .get()
                .uri(url)
                .header("Content-Type", "application/json")
                .header("X-CMC_PRO_API_KEY", "6b555911-d0f2-417f-9bd1-95cf5ea375aa")
                .retrieve()
                .bodyToMono(Apiresponsemodel.class) // Cambiamos a bodyToMono
                .flatMapMany(apiResponse -> Flux.fromIterable(apiResponse.getData()));
    }
}

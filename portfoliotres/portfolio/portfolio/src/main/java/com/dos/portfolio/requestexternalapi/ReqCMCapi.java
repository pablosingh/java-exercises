package com.dos.portfolio.requestexternalapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
// import reactor.core.publisher.Mono;

@RestController
public class ReqCMCapi {

    // @GetMapping("/test/{id}")
    // public Mono<User> getUserById(String id) {
    //     // Imagina que obtienes un usuario de la base de datos
    //     return userService.findUserById(id);
    // }

    // @GetMapping("/users")
    // public Flux<User> getAllUsers() {
    //     // Imagina que obtienes todos los usuarios de la base de datos
    //     return userService.findAllUsers();
    // }
    @Autowired
    private ApiService apiService;

    @GetMapping("/test")
    public Flux<String> fetchExternalData(){
        return apiService.getExternalData();
    }
}

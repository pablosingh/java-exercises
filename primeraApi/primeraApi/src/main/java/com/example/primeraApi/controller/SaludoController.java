package com.example.primeraApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/apisaludos")
public class SaludoController{

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo!";
    }

    @GetMapping("/hola/{nombre}/{edad}")
    public String holaNombre(@PathVariable String nombre, @PathVariable String edad){
        return "Hola "+nombre+" tu edad es : "+edad;
    }
}
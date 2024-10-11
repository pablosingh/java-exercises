package com.dos.portfolio.opspack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/operations")
@RequiredArgsConstructor
public class OperationsController {
    private final OperationsServices opsServices;
    @PostMapping
    public Operations createOperations(@RequestBody Operations operation) {
        return opsServices.createOperations(operation);
    }
    @GetMapping
    public ArrayList<Operations> getArrayOperations(){
        return opsServices.getOperations();
    }
    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }
}

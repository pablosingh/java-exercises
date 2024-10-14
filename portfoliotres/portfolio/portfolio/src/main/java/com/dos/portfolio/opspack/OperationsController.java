package com.dos.portfolio.opspack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dos.portfolio.holpack.Holdings;

import lombok.RequiredArgsConstructor;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


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
    @GetMapping("/{id}")
    public Optional<Operations> getOperationsById (@PathVariable Long id){
        return opsServices.getOperationsById(id);
    }
    @PutMapping
    public Operations editOperations(@RequestBody Operations operations){
        return opsServices.createOperations(operations);
    }
    @DeleteMapping
    public String deleteOperationsById(@PathVariable Long id){
        if( opsServices.deleteOperations(id) ){
            return "Se ha eliminado con éxito";
        }else{
            return "Error al eliminar";
        }
    }
    @PostMapping("/test")
    public Optional<Holdings> checkholds(@RequestBody Operations operation){
        return opsServices.createOpsWithHolds(operation);
    }
}

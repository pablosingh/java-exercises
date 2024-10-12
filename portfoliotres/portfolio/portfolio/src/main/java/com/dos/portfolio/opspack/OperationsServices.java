package com.dos.portfolio.opspack;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// @NoArgsConstructor
@Service
@AllArgsConstructor
public class OperationsServices {
    private final OperationsInterface operationsRepo;

    public Operations createOperations(Operations ops){
        return operationsRepo.save(ops);
    }
    public ArrayList<Operations> getOperations(){
        return (ArrayList<Operations>) operationsRepo.findAll();
    }
    public Optional<Operations> getOperationsById(Long id){
        return (Optional<Operations>) operationsRepo.findById(id);
    }
    public boolean deleteOperations(Long id){
        try {
            operationsRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

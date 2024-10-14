package com.dos.portfolio.opspack;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dos.portfolio.holpack.Holdings;
import com.dos.portfolio.holpack.HoldingsInterface;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// @NoArgsConstructor
@Service
@AllArgsConstructor
public class OperationsServices {
    private final OperationsInterface operationsRepo;
    private final HoldingsInterface holdsRepo;

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
    public Operations createOpsWithHolds(Operations operation){
        Optional<Holdings> holdsFound = holdsRepo.findByTicker(operation.getTicker());
        if(holdsFound.isPresent()){
            operation.setHolding(holdsFound.get());
        }
        return operationsRepo.save(operation);
    }
}

package com.dos.portfolio.criptopack;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.ArrayList;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CriptoServices {
    private final CriptoInterface criptoRepo;

    public Cripto createCripto(Cripto cripto){
        return criptoRepo.save(cripto);
    }
    public ArrayList<Cripto> getArrayCripto(){
        return (ArrayList<Cripto>) criptoRepo.findAll();
    }
    public Optional<Cripto> getByCriptoStr(String criptoStr){
        return criptoRepo.findByCripto(criptoStr);
    }
    public boolean deleteById(Long id){
        try {
            criptoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

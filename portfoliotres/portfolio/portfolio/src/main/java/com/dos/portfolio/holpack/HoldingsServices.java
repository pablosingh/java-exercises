package com.dos.portfolio.holpack;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HoldingsServices {
    private final HoldingsInterface holdingsRepo;

    public Holdings createHoldings(Holdings holdings){
        return holdingsRepo.save(holdings);
    }
    public ArrayList<Holdings> getHoldings(){
        return (ArrayList<Holdings>) holdingsRepo.findAll();
    }
    public Optional<Holdings> getHoldingsById(Long id){
        return (Optional<Holdings>) holdingsRepo.findById(id);
    }
    public boolean deleteHoldings(Long id){
        try {
            holdingsRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public Optional<Holdings> findByTicker(String ticker){
        return holdingsRepo.findByTicker(ticker);
    }
}

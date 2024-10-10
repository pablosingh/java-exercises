package com.dos.portfolio.holpack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holdings")
@RequiredArgsConstructor
public class HoldingsController {
    private final HoldingsServices holServices;

    @PostMapping
    public Holdings createHoldings(@RequestBody Holdings holdings) {
        return holServices.createHoldings(holdings);        
    }
    @GetMapping
    public ArrayList<Holdings> getArrayHoldings() {
        return holServices.getHoldings();
    }
    @GetMapping("/{id}")
    public Optional<Holdings> getHoldingsById(@PathVariable Long id){
        return (Optional<Holdings>) holServices.getHoldingsById(id);
    }
    @PutMapping
    public Holdings editHoldings(Holdings holdings){
        return holServices.createHoldings(holdings);
    }
    @DeleteMapping("/{id}")
    public boolean deleteHoldings(@PathVariable Long id){
        return holServices.deleteHoldings(id);
    }
}

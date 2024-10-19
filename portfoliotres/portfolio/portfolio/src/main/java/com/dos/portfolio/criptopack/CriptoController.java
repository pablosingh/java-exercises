package com.dos.portfolio.criptopack;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cripto")
@RequiredArgsConstructor
public class CriptoController {
    private final CriptoServices criptoServ;

    @GetMapping
    public ArrayList<Cripto> getArrayCripto(){
        return criptoServ.getArrayCripto();
    }
    @GetMapping("/{criptoStr}")
    public Optional<Cripto> getByCriptoStr(@PathVariable String criptoStr){
        return criptoServ.getByCriptoStr(criptoStr);
    }
    @PostMapping
    public Cripto createCripto(@RequestBody Cripto cripto){
        return criptoServ.createCripto(cripto);
    }
    @PutMapping
    public Cripto editCripto(@RequestBody Cripto cripto){
        return criptoServ.createCripto(cripto);
    }
    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id){
        return criptoServ.deleteById(id);
    }
}

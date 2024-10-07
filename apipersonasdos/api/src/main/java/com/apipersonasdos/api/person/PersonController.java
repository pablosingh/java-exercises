package com.apipersonasdos.api.person;

import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServices personSerivice;

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personSerivice.createPerson(person);
    }
    @GetMapping
    public ArrayList<Person> getArrayPerson() {
        return personSerivice.getArrayPerson();
    }
    @GetMapping("/{id}")
    public Optional<Person> getMethodName(@PathVariable Integer id) {
        return personSerivice.getPersonById(id);
    }
    @DeleteMapping("/{id}")
    public boolean deletePerson(@PathVariable Integer id){
        return personSerivice.deletePerson(id);
    }
    @PutMapping("/{id}")
    public Person editPerson(@PathVariable Integer id, @RequestBody Person person) {
        return personSerivice.createPerson(person);
    }
}

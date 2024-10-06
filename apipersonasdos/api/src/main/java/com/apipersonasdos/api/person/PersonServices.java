package com.apipersonasdos.api.person;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServices {

    private final PersonInterface personRepo;
    
    public Person createPerson( Person person){
        return personRepo.save(person);
    }
    public ArrayList<Person> getArrayPerson(){
        return ( ArrayList<Person>) personRepo.findAll();
    }
    public Optional<Person> findPersonById(Integer id){
        return personRepo.findById(id);
    }
    public boolean deletePerson(Integer id){
        try {
            personRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

package com.pablos.apipersonas.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInterface extends JpaRepository <Person, Integer>{
    
}

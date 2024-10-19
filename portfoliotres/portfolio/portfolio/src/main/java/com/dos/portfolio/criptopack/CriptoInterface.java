package com.dos.portfolio.criptopack;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CriptoInterface extends JpaRepository<Cripto, Long>{
    Optional<Cripto> findByCripto(String criptoStr);
}

package com.dos.portfolio.holpack;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface HoldingsInterface extends JpaRepository <Holdings, Long>{
    Optional<Holdings> findByTicker(String ticker);
}

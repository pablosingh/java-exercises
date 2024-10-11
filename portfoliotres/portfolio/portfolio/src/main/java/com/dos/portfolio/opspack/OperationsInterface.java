package com.dos.portfolio.opspack;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationsInterface extends JpaRepository <Operations, Long>{

}

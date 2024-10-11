package com.dos.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
// @EntityScan(basePackages = {"opspack", "com.dos.portfolio.holpack"})
@EntityScan(basePackages = {"com.dos.portfolio.opspack", "com.dos.portfolio.holpack"})
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}

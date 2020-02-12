package com.needine.pbmovements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PbMovementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbMovementsApplication.class, args);
	}

}

package com.diceprojects.calculationsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EntityScan("com.diceprojects.calculationsservice.persistences.models.entities")
@EnableReactiveMongoRepositories(basePackages = "com.diceprojects.calculationsservice.persistences.repositories")
@EnableCaching
public class CalculationsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculationsServiceApplication.class, args);
    }

}

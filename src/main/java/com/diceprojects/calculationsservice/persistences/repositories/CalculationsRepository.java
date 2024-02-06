package com.diceprojects.calculationsservice.persistences.repositories;

import com.diceprojects.calculationsservice.persistences.models.entities.Calculation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationsRepository extends ReactiveMongoRepository<Calculation, String> {

}
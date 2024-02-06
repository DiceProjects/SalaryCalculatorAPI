package com.diceprojects.calculationsservice.services;

import com.diceprojects.calculationsservice.persistences.models.entities.Calculation;

import java.util.List;
import java.util.Optional;

public interface CalculationsService {
    Optional<Calculation> saveCalculation(Calculation calculation);
    Optional<List<Calculation>> getAllCalculations();

}

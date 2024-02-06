package com.diceprojects.calculationsservice.services;

import com.diceprojects.calculationsservice.persistences.models.entities.Calculation;
import com.diceprojects.calculationsservice.persistences.repositories.CalculationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalculationsServiceImplement implements CalculationsService {
    private final CalculationsRepository calculationsRepository;

    @Autowired
    public CalculationsServiceImplement(CalculationsRepository calculationsRepository) {
        this.calculationsRepository = calculationsRepository;
    }

    @Override
    public Optional<Calculation> saveCalculation(Calculation calculation) {
        return Optional.of(calculationsRepository.save(calculation).block());
    }

    @Override
    public Optional<List<Calculation>> getAllCalculations() {
        List<Calculation> calculations = (List<Calculation>) calculationsRepository.findAll();
        return Optional.ofNullable(calculations);
    }
}
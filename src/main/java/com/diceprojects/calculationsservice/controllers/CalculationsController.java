package com.diceprojects.calculationsservice.controllers;

import com.diceprojects.calculationsservice.persistences.models.entities.Calculation;
import com.diceprojects.calculationsservice.services.CalculationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculations")
public class CalculationsController {

    private final CalculationsService calculationsService;

    @Autowired
    public CalculationsController(CalculationsService calculationsService) {
        this.calculationsService = calculationsService;
    }

    @PostMapping("/save")
    public Calculation saveCalculation(@RequestBody Calculation calculation) {
        return calculationsService.saveCalculation(calculation).orElse(null);
    }

    @GetMapping("/all")
    public List<Calculation> getAllCalculations() {
        return calculationsService.getAllCalculations().orElse(null);
    }
}

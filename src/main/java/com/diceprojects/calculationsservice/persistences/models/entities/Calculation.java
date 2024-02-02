package com.diceprojects.calculationsservice.persistences.models.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "calculations")
public class Calculation {
    @Id
    private String id;
    private double sueldoBruto;
    private double sueldoNeto;

}

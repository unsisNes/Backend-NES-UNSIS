package com.unsis.edu.saeunsisfichas.model.person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PersonModel {
    @Id
    private String curp;
}

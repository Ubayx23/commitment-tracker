package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Commitment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    

}

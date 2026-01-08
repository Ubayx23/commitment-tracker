package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity


public class Commitment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String userId;
    private String title;
    private String description;
    private Boolean check;
    private LocalDateTime dueDate;

    //Commitment Overdue Check
    public boolean hasExpired() {
       LocalDateTime currentTime = LocalDateTime.now();
       if(currentTime.isAfter(dueDate)){
        return true;
       }
       return false;
    }
    
}


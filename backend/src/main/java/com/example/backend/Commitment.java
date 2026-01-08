package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity // This annotation tells JPA to create a table in the database for this class

// Making the commitment class
public class Commitment {

    // This annotation tells JPA to create a primary key for the commitment table
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String userId;
    private String title;
    private LocalDateTime dueDate;
    

   
    // Checks if the commitment has expired
    public boolean hasExpired() {
       LocalDateTime currentTime = LocalDateTime.now();
       if(currentTime.isAfter(dueDate)){
        return true;
       }
       return false;
    }
    
}


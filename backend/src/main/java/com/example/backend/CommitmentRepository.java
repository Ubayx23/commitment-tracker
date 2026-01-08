package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;

// Allows the service layer to perform CRUD operations on the commitment table
public interface CommitmentRepository extends JpaRepository<Commitment, Long> {
}

package com.example.backend;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CommitmentService {

    private final CommitmentRepository commitmentRepository;

    @Autowired
    public CommitmentService(CommitmentRepository commitmentRepository) {
        this.commitmentRepository = commitmentRepository;
    }

    public void createCommitment(Commitment commitment) {
        commitmentRepository.save(commitment);
    }
}

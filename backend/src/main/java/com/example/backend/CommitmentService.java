// This service checks commitments. 
// If a commitment has expired, it responds with a failure message.
// If not, it does nothing.

package com.example.backend;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class CommitmentService {

    private final CommitmentRepository commitmentRepository;

    // Injects the commitment repository into the service
    @Autowired
    public CommitmentService(CommitmentRepository commitmentRepository) {
        this.commitmentRepository = commitmentRepository;
    }

    // Creates a new commitment
    public void createCommitment(Commitment commitment) {
        commitmentRepository.save(commitment);
    }

    // Checks if the commitment has expired
    public String checkCommitment(Commitment commitment) {
        if(commitment.hasExpired()) {
            return "Commitment failed. Acknowledge failure before continuing.";
        }
        return null;
    }
}

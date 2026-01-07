package com.example.commitment;

// Enum for commitment states
// Enums are like constants, but better - they're type-safe
public enum CommitmentStatus {
    ACTIVE,      // Currently in progress
    COMPLETED,   // Finished before deadline
    BROKEN       // Deadline passed without completion
}


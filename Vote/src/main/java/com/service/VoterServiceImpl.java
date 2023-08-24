package com.service;

import com.dao.VoterDAO;
import com.entity.Voter;


public class VoterServiceImpl implements VoterService {

  
    private VoterDAO voterDAO;

    @Override
    public Voter findByUsername(String username) {
        return voterDAO.findByUsername(username);
    }

    @Override
    public void registerVoter(Voter voter) {
        // Check if the username is not already taken
        if (findByUsername(voter.getUsername()) != null) {
            throw new IllegalArgumentException("Username already exists.");
        }
        
        // Validate voter's data (e.g., format of email, age requirements, etc.)
        if (!isValidVoterData(voter)) {
            throw new IllegalArgumentException("Invalid voter data.");
        }
        
        // Hash the voter's password before storing it in the database
        String hashedPassword = hashPassword(voter.getPassword());
        voter.setPassword(hashedPassword);
        
        // Save the voter to the database
        voterDAO.save(voter);
    }
    
    // Private method for hashing the password (using a secure password hashing library is recommended)
    private String hashPassword(String password) {
        // Implement password hashing logic (e.g., using BCrypt or a similar library)
        return hashPassword(null);
    }
    
    // Private method to validate voter's data
    private boolean isValidVoterData(Voter voter) {
        // Implement validation logic based on your requirements
        return true; // Return true if data is valid, false otherwise
    }
}

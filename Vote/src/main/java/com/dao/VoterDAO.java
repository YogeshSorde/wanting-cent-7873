package com.dao;

import com.entity.Voter;

public interface VoterDAO {
    Voter getById(Long id);
    Voter getByUsername(String username);
    void saveOrUpdate(Voter voter);
    void delete(Voter voter);
    // Other methods
	Voter findByUsername(String username);
	void save(Voter voter);
}

// Similarly, create DAOs for other entities (Candidate, Election, Vote)

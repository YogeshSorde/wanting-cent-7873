package com.service;

import com.entity.Voter;

public interface VoterService {
    Voter findByUsername(String username);
    void registerVoter(Voter voter);
}


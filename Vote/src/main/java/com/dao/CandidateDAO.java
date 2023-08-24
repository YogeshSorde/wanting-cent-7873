package com.dao;

import java.util.List;

import com.entity.Candidate;

public interface CandidateDAO {
    List<Candidate> getAllCandidates();
    Candidate getCandidateById(Long id);
    void saveCandidate(Candidate candidate);
    void updateCandidate(Candidate candidate);
    void deleteCandidate(Long id);
}
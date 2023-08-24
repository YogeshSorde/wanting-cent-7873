package com.dao;

import java.util.List;

import com.entity.Candidate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;


public class CandidateDAOImpl implements CandidateDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Candidate> getAllCandidates() {
        TypedQuery<Candidate> query = entityManager.createQuery("SELECT c FROM Candidate c", Candidate.class);
        return query.getResultList();
    }

    @Override
    public Candidate getCandidateById(Long id) {
        return entityManager.find(Candidate.class, id);
    }

    @Override
    public void saveCandidate(Candidate candidate) {
        entityManager.persist(candidate);
    }

    @Override
    public void updateCandidate(Candidate candidate) {
        entityManager.merge(candidate);
    }

    @Override
    public void deleteCandidate(Long id) {
        Candidate candidate = entityManager.find(Candidate.class, id);
        if (candidate != null) {
            entityManager.remove(candidate);
        }
    }
}

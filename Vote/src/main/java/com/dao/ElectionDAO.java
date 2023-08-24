package com.dao;

import java.util.List;

import com.entity.Election;

public interface ElectionDAO {
    List<Election> getAllElections();
    Election findById(Long id);
    void save(Election election);
    void update(Election election);
    void delete(Long id);
}

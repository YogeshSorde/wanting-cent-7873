package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String agenda;
    // Other attributes and relationships
	public Candidate(Long id, String name, String agenda) {
		super();
		this.id = id;
		this.name = name;
		this.agenda = agenda;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", agenda=" + agenda + "]";
	}
    
    
}
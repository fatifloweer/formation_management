package com.example.formation.entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Developer extends Personnes {

    public Developer(String nom, String prenom, String email, String password, String mobile) {
		super(nom, prenom, email, password, mobile);
		// TODO Auto-generated constructor stub
	}
    
    @OneToMany(mappedBy = "developer")
    private List<Experience> experiences;

    
	public Developer() {
		super();
	}
	
	

public Developer(List<Experience> experiences) {
	super();
	this.experiences = experiences;
}


	
}



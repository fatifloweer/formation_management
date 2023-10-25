package com.example.formation.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends Personnes {

	public Admin(String nom, String prenom, String email, String password, String mobile) {
		super(nom, prenom, email, password, mobile);
		// TODO Auto-generated constructor stub
	}
	
}


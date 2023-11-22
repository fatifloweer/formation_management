//package com.example.formation.entity;
//
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Recruiter extends Personnes {
//
//	public Recruiter(String nom, String prenom, String email, String password, String mobile) {
//		super( nom, prenom, email, password, mobile);
//		// TODO Auto-generated constructor stub
//	}
//
//	@OneToMany(mappedBy = "recruiter")
//	   private List <RDV> rendezVous;
//
//	
//	public List<RDV> getRendezVous() {
//		return rendezVous;
//	}
//
//	public void setRendezVous(List<RDV> rendezVous) {
//		this.rendezVous = rendezVous;
//	}
//	
//	
//}

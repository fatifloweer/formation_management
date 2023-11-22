//package com.example.formation.entity;
//
//import java.util.List;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.JoinColumn;
//
//@Entity
//public class Formation {
//	
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idFormation;
//    private String nom;
//    private String description;
//
//
//    @ManyToMany(mappedBy = "formations")
//    private List<Teacher> teachers;
//    
//	public Long getIdFormation() {
//		return idFormation;
//	}
//
//	public void setIdFormation(Long idFormation) {
//		this.idFormation = idFormation;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public List<Teacher> getTeachers() {
//		return teachers;
//	}
//
//	public void setTeachers(List<Teacher> teachers) {
//		this.teachers = teachers;
//	}
//
//
//    
//}
//

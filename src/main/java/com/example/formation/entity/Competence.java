//package com.example.formation.entity;
//
//import java.util.List;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Competence {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String programmingLang;
//
//    @ManyToMany(mappedBy = "competences")
//    private List<Developer> developers;
//    
//    public Competence() {
//    	
//    }
//
//    public Competence(String programmingLang) {
//        this.programmingLang = programmingLang;
//    }
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getProgrammingLang() {
//		return programmingLang;
//	}
//
//	public void setProgrammingLang(String programmingLangg) {
//		this.programmingLang = programmingLang;
//	}
//    
//}

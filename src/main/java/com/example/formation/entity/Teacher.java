//package com.example.formation.entity;
//
//import java.util.List;
//import jakarta.persistence.Entity;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Teacher extends Personnes {
//
//    @ManyToMany(mappedBy = "teachers")
//    private List<Developer> developers;
//
//    @ManyToMany(mappedBy = "teachers")
//    private List<Formation> formations;
//    
//    @OneToMany(mappedBy = "teacher")
//    private List <PDF> pdfs;
//    
//    public Teacher(String nom, String prenom, String email, String password, String mobile) {
//		super(nom, prenom, email, password, mobile);
//		// TODO Auto-generated constructor stub
//	}
//    
//	public Teacher(List<Developer> developers, List<Formation> formations, List<PDF> pdfs) {
//		super();
//		this.developers = developers;
//		this.formations = formations;
//		this.pdfs = pdfs;
//	}
//
//	public List<Developer> getDevelopers() {
//		return developers;
//	}
//
//	public void setDevelopers(List<Developer> developers) {
//		this.developers = developers;
//	}
//
//	public List<Formation> getFormations() {
//		return formations;
//	}
//
//	public void setFormations(List<Formation> formations) {
//		this.formations = formations;
//	}
//
//	public List<PDF> getPdfs() {
//		return pdfs;
//	}
//
//	public void setPdfs(List<PDF> pdfs) {
//		this.pdfs = pdfs;
//	}
//}
//
//

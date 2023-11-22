//package com.example.formation.entity;
//
//import java.sql.Date;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class RDV {
//	
//	 @Id
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
//	 private int id;
//	 private String Email;
//	 private Date date;
//	 
//	 @ManyToOne
//	 private Developer developer;
//	 
//	 @ManyToOne
//	 private Recruiter recruiter;
//
//	 public RDV(String email, Date date, Developer developer) {
//		super();
//		Email = email;
//		this.date = date;
//		this.developer = developer;
//	 }
//
//	public RDV() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public int getIdRdv() {
//		return id;
//	}
//
//	public void setIdRdv(int id) {
//		this.id = id;
//	}
//
//	public String getEmail() {
//		return Email;
//	}
//
//	public void setEmail(String email) {
//		Email = email;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public Developer getDeveloper() {
//		return developer;
//	}
//
//	public void setDeveloper(Developer developer) {
//		this.developer = developer;
//	} 
//	 
//}
//

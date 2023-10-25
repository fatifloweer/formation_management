package com.example.formation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PDF {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pdfORimg;
    private String title;
    
    @ManyToOne
    private Teacher teacher;

	public PDF( String pdfORimg, String title, Teacher teacher) {
		super();
		this.pdfORimg = pdfORimg;
		this.title = title;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPdfORimg() {
		return pdfORimg;
	}

	public void setPdfORimg(String pdfORimg) {
		this.pdfORimg = pdfORimg;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}


package com.example.formation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Project {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String url;

    @ManyToOne
	@JoinColumn(name = "project_id")
	private Developer developer;

	public Project(String url, Developer developer) {
		super();
		this.url = url;
		this.developer = developer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

}
	

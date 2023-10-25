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

	@ManyToMany
    @JoinTable(name = "developer_competences", joinColumns = @JoinColumn(name = "developer_id"), inverseJoinColumns = @JoinColumn(name = "competences_id"))
    private List<Competence> competences;

    @ManyToMany(mappedBy = "developers")
    private List<Teacher> teachers;
    
    @OneToMany(mappedBy = "developer")
    private List<Experience> experiences;
    
    @OneToMany(mappedBy = "developer")
    private List <Project> projects;
    
    @OneToMany(mappedBy = "developer")
    private List <RDV> rendezVous;
    
	public Developer() {
		super();
	}

	public Developer(List<Competence> competences, List<Teacher> teachers, List<Experience> experiences,
			List<Project> projects, List<RDV> rendezVous) {
		super();
		this.competences = competences;
		this.teachers = teachers;
		this.experiences = experiences;
		this.projects = projects;
		this.rendezVous = rendezVous;
	}


	@Override
	public String toString() {
		return "Developer [getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getMobile()=" + getMobile()
				+ ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}



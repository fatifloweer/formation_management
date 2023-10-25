package com.example.formation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleType; // e.g., "developer," "teacher," "recruiter," "admin"

    @OneToMany(mappedBy = "role")
    private List<Personnes> personnes;

    public Role() {
        // Default no-argument constructor
    }

    public Role(String roleType) {
        this.roleType = roleType;
    }

    // Getters and setters for fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public List<Personnes> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personnes> personnes) {
        this.personnes = personnes;
    }
}


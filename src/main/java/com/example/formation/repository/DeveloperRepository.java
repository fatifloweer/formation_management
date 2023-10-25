package com.example.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.formation.entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
	

}

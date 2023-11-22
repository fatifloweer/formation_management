package com.example.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formation.entity.Experience;
import com.example.formation.repository.ExperienceRepository;

@Service
public class ExperienceService {

	@Autowired	
	private ExperienceRepository repository;
	
	public Experience saveExperience(Experience experience) {
		return repository.save(experience);
	}
	
	public List<Experience> saveExperiences(List<Experience> experiences){
		return repository.saveAll(experiences);
	}
	
	public List <Experience> getExperiences(){	
		return repository.findAll();
	}
	
	public Experience getExperienceById(int id){
		return repository.findById(id).orElse(null);
	}
	
//	public Experience getExperienceByName(String name) {
//		return repository.findByName(name);
//	}
	
	public String deleteExperience(int id){
		repository.deleteById(id);
		return "product removed !!" + id;
	}
	
	
	public Experience updateExperience(Experience experience) {
		Experience existingExperience = repository.findById(experience.getId()).orElse(null);
		existingExperience.setDate_debut(experience.getDate_debut());
		existingExperience.setDate_fin(experience.getDate_fin());
		existingExperience.setCompany(experience.getCompany());
		existingExperience.setDeveloper(experience.getDeveloper());
		return repository.save(existingExperience);
	}
	
	
	
	
	
	
}

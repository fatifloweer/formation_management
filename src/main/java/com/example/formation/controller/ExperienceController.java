package com.example.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.formation.entity.Experience;
import com.example.formation.service.ExperienceService;

@RestController

public class ExperienceController {
	
	@Autowired
	private ExperienceService service;
	
	@PostMapping("/addExperience")
	public Experience addExperience(@RequestBody Experience experience) {
		return service.saveExperience(experience);
	}
	
	@PostMapping("/addExperiences")
	public List<Experience> addExperiences(@RequestBody List<Experience> experiences){
		return service.saveExperiences(experiences);
	}
	
	@GetMapping("/experiences")
	public List<Experience> findAllExperiences(){
		return service.getExperiences();
	}
	
	@GetMapping("/experiences/{id}")
	public Experience findExperienceById(@PathVariable int id) {
		return service.getExperienceById(id);
	}
	
//	@GetMapping("/experiences/{name}")
//	public Experience findExperienceByName(@PathVariable String name) {
//		return service.getExperienceByName(name);
//	}
	
	@PutMapping("/update/{id}")
	public Experience updateExperience(@PathVariable int id, @RequestBody Experience experience) {
	    // Use the 'id' path variable to identify the experience to update
	    experience.setId(id);

	    return service.updateExperience(experience);
	}

	
	@DeleteMapping("/delete/{id}")
	public String deleteExperience(@PathVariable int id) {
		return service.deleteExperience(id);
	}
	
	
	
	
	
}

package com.example.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formation.entity.Developer;
import com.example.formation.repository.DeveloperRepository;

@Service
public class DeveloperService {

	 @Autowired
	    private DeveloperRepository repo;
	    
	    public List<Developer> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Developer dev) {
	        repo.save(dev);
	    }
	     
	    public Developer get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	    
	    
}

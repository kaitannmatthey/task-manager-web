package com.taskmanager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.taskmanager.db.ImportanceRepository;

@CrossOrigin
@RestController
@RequestMapping("/importances")
public class ImportanceController {
	
	@Autowired
	private ImportanceRepository importanceRepo;
	
	// List All Difficulties
	@GetMapping("/")
	public JsonResponse ListDifficulties() {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(importanceRepo.findAll());
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
			e.printStackTrace();
		}
		return jr;
	}
	
	// Get a importance by id
	@GetMapping("/{id}")
	public JsonResponse getImportance(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(importanceRepo.findById(id));
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
			e.printStackTrace();
		}
		return jr;
	}
	
	// Add an importance
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
	// Update an importance
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
	// Delete an importance
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
}


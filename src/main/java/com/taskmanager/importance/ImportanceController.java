package com.taskmanager.importance;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import com.taskmanager.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping("/importances")
public class ImportanceController {
	
	private final ImportanceRepository importanceRepo;
	
	public ImportanceController(ImportanceRepository importanceRepo) {
		Assert.notNull(importanceRepo, "ImportanceRepository must not be null");
		this.importanceRepo = importanceRepo;
	}
	
	// List All Importances
	@GetMapping("/")
	public JsonResponse listImportances() {
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


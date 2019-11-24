package com.taskmanager.status;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import com.taskmanager.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping("/statuses")
public class StatusController {
	
	private final StatusRepository statusRepo;
	
	public StatusController(StatusRepository statusRepo) {
		Assert.notNull(statusRepo, "StatusRepository must not be null");
		this.statusRepo = statusRepo;
	}
	
	// List All Statuses
	@GetMapping("/")
	public JsonResponse listStatuses() {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(statusRepo.findAll());
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
			e.printStackTrace();
		}
		return jr;
	}
	
	// Get a status by id
	@GetMapping("/{id}")
	public JsonResponse getStatus(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(statusRepo.findById(id));
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
			e.printStackTrace();
		}
		return jr;
	}
	
	// Add a status
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
	// Update a status
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
	// Delete a status
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
}


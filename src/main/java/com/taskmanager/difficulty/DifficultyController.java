package com.taskmanager.difficulty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.taskmanager.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping("/difficulties")
public class DifficultyController {
	
	@Autowired
	private DifficultyRepository difficultyRepo;
	
	// List All Difficulties
	@GetMapping("/")
	public JsonResponse ListDifficulties() {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(difficultyRepo.findAll());
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
			e.printStackTrace();
		}
		return jr;
	}
	
	// Get a difficulty by id
	@GetMapping("/{id}")
	public JsonResponse getDifficulty(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(difficultyRepo.findById(id));
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
			e.printStackTrace();
		}
		return jr;
	}
	
	// Add a difficulty
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
	// Update a difficulty
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
	// Delete a difficulty
	// Purposefully not making this an option, but here's where I'd put it if I change my mind.
	
}


package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trainee;
import com.example.demo.repository.TraineeRepo;

@RestController
@RequestMapping("/trainees")
public class TraineeController {
	@Autowired
	TraineeRepo repo;
	 @GetMapping
	public List<Trainee> getAllTrainees() {
		return repo.findAll();
		
	}
	@PostMapping
	public Trainee addTrainee(@RequestBody Trainee t) {
		return repo.save(t);
		
	}

}

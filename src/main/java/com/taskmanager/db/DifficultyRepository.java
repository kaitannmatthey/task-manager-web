package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Difficulty;

public interface DifficultyRepository extends CrudRepository<Difficulty, Integer> {

}

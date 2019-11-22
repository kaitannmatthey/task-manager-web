package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Importance;

public interface ImportanceRepository extends CrudRepository<Importance, Integer> {

}

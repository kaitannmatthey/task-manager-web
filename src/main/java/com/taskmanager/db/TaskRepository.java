package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}

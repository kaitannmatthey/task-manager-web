package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.List;

public interface ListRepository extends CrudRepository<List, Integer>{

}

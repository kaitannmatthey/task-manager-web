package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.ImportantDate;

public interface ImportantDateRepository extends CrudRepository<ImportantDate, Integer>{

}

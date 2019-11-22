package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {

}

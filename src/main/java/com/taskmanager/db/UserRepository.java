package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

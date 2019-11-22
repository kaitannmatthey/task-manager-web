package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

}

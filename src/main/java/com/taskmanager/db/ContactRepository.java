package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer>{

}

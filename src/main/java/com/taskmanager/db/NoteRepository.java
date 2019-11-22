package com.taskmanager.db;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.business.Note;

public interface NoteRepository extends CrudRepository<Note, Integer>{

}

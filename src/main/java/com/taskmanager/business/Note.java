package com.taskmanager.business;

import javax.persistence.*;

@Entity
public class Note {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String note;
	private int taskID;
	
	public Note() {
		super();
	}

	public Note(int id, String note, int taskID) {
		super();
		this.id = id;
		this.note = note;
		this.taskID = taskID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getTask() {
		return taskID;
	}

	public void setTask(int taskID) {
		this.taskID = taskID;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", note=" + note + ", taskID=" + taskID + "]";
	}
	
	
}

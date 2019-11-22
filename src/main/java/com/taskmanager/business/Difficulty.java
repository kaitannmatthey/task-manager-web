package com.taskmanager.business;

import javax.persistence.*;

@Entity
public class Difficulty {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	public Difficulty() {
		super();
	}

	public Difficulty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Difficulty [id=" + id + ", name=" + name + "]";
	}
	
	
}

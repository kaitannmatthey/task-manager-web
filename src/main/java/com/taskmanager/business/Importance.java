package com.taskmanager.business;

import javax.persistence.*;

@Entity
public class Importance {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	public Importance() {
		super();
	}

	public Importance(int id, String name) {
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
		return "Importance [id=" + id + ", name=" + name + "]";
	}
	
	
}

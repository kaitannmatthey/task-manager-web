package com.taskmanager.importantdate;

import javax.persistence.*;

@Entity
public class ImportantDate {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	public ImportantDate() {
		super();
	}

	public ImportantDate(int id, String name, double averageTime) {
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
		return "ImportantDate [id=" + id + ", name=" + name + "]";
	}
	
	
}

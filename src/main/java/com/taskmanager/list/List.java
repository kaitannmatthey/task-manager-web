package com.taskmanager.list;

import javax.persistence.*;

@Entity
public class List {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private int name;
	
	public List() {
		super();
	}

	public List(int id, int name) {
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

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Status [id=" + id + ", name=" + name + "]";
	}
}

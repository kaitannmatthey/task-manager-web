package com.taskmanager.business;

import javax.persistence.*;

@Entity
public class Category {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double averageTime;
	
	public Category() {
		super();
	}

	public Category(int id, String name, double averageTime) {
		super();
		this.id = id;
		this.name = name;
		this.averageTime = averageTime;
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

	public double getAverageTime() {
		return averageTime;
	}

	public void setAverageTime(double averageTime) {
		this.averageTime = averageTime;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", averageTime=" + averageTime + "]";
	}
	
	
}

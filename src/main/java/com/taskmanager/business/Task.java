package com.taskmanager.business;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Task {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalDate dueDate;
	private int difficultyID;
	private int importanceID;
	private int statusID;
	private LocalDate startDate;
	private LocalDate endDate;
	private int parentTaskID;
	private int listID;
	private int contactID;
	private int categoryID;
	
	public Task() {
		super();
	}

	public Task(int id, String name, LocalDate dueDate, int difficultyID, int importanceID, int statusID,
			LocalDate startDate, LocalDate endDate, int parentTaskID, int listID, int contactID, int categoryID) {
		super();
		this.id = id;
		this.name = name;
		this.dueDate = dueDate;
		this.difficultyID = difficultyID;
		this.importanceID = importanceID;
		this.statusID = statusID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.parentTaskID = parentTaskID;
		this.listID = listID;
		this.contactID = contactID;
		this.categoryID = categoryID;
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

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public int getDifficulty() {
		return difficultyID;
	}

	public void setDifficulty(int difficultyID) {
		this.difficultyID = difficultyID;
	}

	public int getImportance() {
		return importanceID;
	}

	public void setImportance(int importanceID) {
		this.importanceID = importanceID;
	}

	public int getStatus() {
		return statusID;
	}

	public void setStatus(int statusID) {
		this.statusID = statusID;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getParentTaskID() {
		return parentTaskID;
	}

	public void setParentTaskID(int parentTaskID) {
		this.parentTaskID = parentTaskID;
	}

	public int getList() {
		return listID;
	}

	public void setList(int listID) {
		this.listID = listID;
	}

	public int getContact() {
		return contactID;
	}

	public void setContact(int contactID) {
		this.contactID = contactID;
	}

	public int getCategory() {
		return categoryID;
	}

	public void setCategory(int categoryID) {
		this.categoryID = categoryID;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", dueDate=" + dueDate + ", difficultyID=" + difficultyID
				+ ", importanceID=" + importanceID + ", statusID=" + statusID + ", startDate=" + startDate + ", endDate="
				+ endDate + ", parentTaskID=" + parentTaskID + ", listID=" + listID + ", contactID=" + contactID + ", categoryID="
				+ categoryID + "]";
	}
	
	
	
}

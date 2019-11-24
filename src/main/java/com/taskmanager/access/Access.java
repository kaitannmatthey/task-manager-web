package com.taskmanager.access;

import javax.persistence.*;

@Entity
public class Access {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private boolean permission;
	private int listID;
	private int userID;
	
	public Access() {
		super();
	}

	public Access(int id, boolean permission, int listID, int userID) {
		super();
		this.id = id;
		this.permission = permission;
		this.listID = listID;
		this.userID = userID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPermission() {
		return permission;
	}

	public void setPermission(boolean permission) {
		this.permission = permission;
	}

	public int getList() {
		return listID;
	}

	public void setList(int listID) {
		this.listID = listID;
	}

	public int getUser() {
		return userID;
	}

	public void setUser(int userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "Access [id=" + id + ", permission=" + permission + ", listID=" + listID + ", userID=" + userID + "]";
	}
	
}

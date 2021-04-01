package com.Roshni.Entity;

public class EventCat {
	int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	String title;
	int status;

	public EventCat() {
		
	}
	
	public EventCat(String title, int status) {
		super();
		this.title = title;
		this.status = status;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

package com.Roshni.Entity;


public class Events {
	private int id, event_category_id, status;
	private String title, description,date_time, file_name;
	private float cost;
	
	
	
	

	public Events() {
		
	}
	
	
	public Events(int event_category_id, int status, String title, String description, float cost, String date_time,String file_name) {
		super();
		this.event_category_id = event_category_id;
		this.status = status;
		this.title = title;
		this.description = description;
		this.cost = cost;
		this.date_time = date_time;
		this.file_name = file_name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEvent_category_id() {
		return event_category_id;
	}
	public void setEvent_category_id(int event_category_id) {
		this.event_category_id = event_category_id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}


	public String getDate_time() {
		return date_time;
	}


	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}


	public String getFile_name() {
		return file_name;
	}


	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
	
	
	
}


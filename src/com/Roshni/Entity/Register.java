package com.Roshni.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Register {
	
	private int id;
	
	private String name;
	
	private String student_id;
	
	private String emailid;
	
	private String password;
	
	private String role;
	
	public Register() {
		
	}
	public Register(String name, String student_id, String emailid, String password) {
		super();
		this.name = name;
		this.student_id = student_id;
		this.emailid = emailid;
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}

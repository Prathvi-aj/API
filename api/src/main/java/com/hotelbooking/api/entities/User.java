package com.hotelbooking.api.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long user_id, String first_name, String last_name, String user_city, String email_id) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_city = user_city;
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", user_city="
				+ user_city + ", email_id=" + email_id + ", getUser_id()=" + getUser_id() + ", getFirst_name()="
				+ getFirst_name() + ", getLast_name()=" + getLast_name() + ", getUser_city()=" + getUser_city()
				+ ", getEmail_id()=" + getEmail_id() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_city() {
		return user_city;
	}
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Id
	private long user_id;
	private String first_name;
	private String last_name;
	private String user_city;
	private String email_id;
	
}

package com.hotelbooking.api.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	
	@Id
	private long hotel_id;
	private String hotel_name;
	private int rooms;
	private int stars;
	private String wifiFacility;
	private String resaturent;
	private String airConditinor;
	private String meal;
	private long room_charge;
	private String hotel_city;
	private Date date;
	public Hotel(long hotel_id, String hotel_name, int rooms, int stars, String wifiFacility, String resaturent,
			String airConditinor, String meal, long room_charge, String hotel_city, Date date) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.rooms = rooms;
		this.stars = stars;
		this.wifiFacility = wifiFacility;
		this.resaturent = resaturent;
		this.airConditinor = airConditinor;
		this.meal = meal;
		this.room_charge = room_charge;
		this.hotel_city = hotel_city;
		this.date = date;
	}
	public long getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(long hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getWifiFacility() {
		return wifiFacility;
	}
	public void setWifiFacility(String wifiFacility) {
		this.wifiFacility = wifiFacility;
	}
	public String getResaturent() {
		return resaturent;
	}
	public void setResaturent(String resaturent) {
		this.resaturent = resaturent;
	}
	public String getAirConditinor() {
		return airConditinor;
	}
	public void setAirConditinor(String airConditinor) {
		this.airConditinor = airConditinor;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public long getRoom_charge() {
		return room_charge;
	}
	public void setRoom_charge(long room_charge) {
		this.room_charge = room_charge;
	}
	public String getHotel_city() {
		return hotel_city;
	}
	public void setHotel_city(String hotel_city) {
		this.hotel_city = hotel_city;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", rooms=" + rooms + ", stars=" + stars
				+ ", wifiFacility=" + wifiFacility + ", resaturent=" + resaturent + ", airConditinor=" + airConditinor
				+ ", meal=" + meal + ", room_charge=" + room_charge + ", hotel_city=" + hotel_city + ", date=" + date
				+ ", getHotel_id()=" + getHotel_id() + ", getHotel_name()=" + getHotel_name() + ", getRooms()="
				+ getRooms() + ", getStars()=" + getStars() + ", getWifiFacility()=" + getWifiFacility()
				+ ", getResaturent()=" + getResaturent() + ", getAirConditinor()=" + getAirConditinor() + ", getMeal()="
				+ getMeal() + ", getRoom_charge()=" + getRoom_charge() + ", getHotel_city()=" + getHotel_city()
				+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

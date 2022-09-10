package com.hotelbooking.api.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	private long review_id;
	private String comment;
	private int rating;
	private int hotel_id;
	private String hotel_name;
	private int user_id;
	private String user_name;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Review [review_id=" + review_id + ", comment=" + comment + ", rating=" + rating + ", hotel_id="
				+ hotel_id + ", hotel_name=" + hotel_name + ", user_id=" + user_id + ", user_name=" + user_name
				+ ", getReview_id()=" + getReview_id() + ", getComment()=" + getComment() + ", getRating()="
				+ getRating() + ", getHotel_id()=" + getHotel_id() + ", getHotel_name()=" + getHotel_name()
				+ ", getUser_id()=" + getUser_id() + ", getUser_name()=" + getUser_name() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public long getReview_id() {
		return review_id;
	}
	public void setReview_id(long review_id) {
		this.review_id = review_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Review(long review_id, String comment, int rating, int hotel_id, String hotel_name, int user_id,
			String user_name) {
		super();
		this.review_id = review_id;
		this.comment = comment;
		this.rating = rating;
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.user_id = user_id;
		this.user_name = user_name;
	}
}

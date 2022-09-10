package com.hotelbooking.api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hotelbooking.api.entities.Hotel;
import com.hotelbooking.api.entities.Review;
import com.hotelbooking.api.entities.User;
import com.hotelbooking.api.services.HotelService;
import com.hotelbooking.api.services.ReviewService;
import com.hotelbooking.api.services.UserService;

@RestController
public class Controller {
	@Autowired
	private HotelService hotelservice;
	
	@Autowired
	private UserService userservice;
	@Autowired
	private ReviewService reviewservice;
	
	
	@PostMapping("/hotelbooking/hotels")
	public List<Hotel> getHotels(@RequestBody Hotel hotel) {
		return this.hotelservice.getHotels(hotel);
	}
	
	@PutMapping("/hotelbooking/update-hotel-info")
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return this.hotelservice.updateHotel(hotel);
	}
	
	@PostMapping("/hotelbooking/add-hotel")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return this.hotelservice.addHotel(hotel);
	}
	
	@DeleteMapping("/hotelbooking/delete-hotel-by-id/{hotel_id}")
	public ResponseEntity<HttpStatus> deleteHotel(@PathVariable String hotel_id){
		try {
			this.hotelservice.deleteHotel(Long.parseLong(hotel_id));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/hotelbooking/review")
	public List<Review> getReviews() {
		return this.reviewservice.getreviews();
	}
	
	@PutMapping("/hotelbooking/update-review-info")
	public Review updateReview(@RequestBody Review review) {
		return this.reviewservice.updateReview(review);
	}
	
	@PostMapping("/hotelbooking/add-review")
	public Review addreview(@RequestBody Review review) {
		return this.reviewservice.addreview(review);
	}
	

	@DeleteMapping("/hotelbooking/delete-review-by-id/{review_id}")
	public ResponseEntity<HttpStatus> deleteReview(@PathVariable String review_id){
		try {
			this.reviewservice.deleteReview(Long.parseLong(review_id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping("/hotelbooking/user")
	public List<User> getuser() {
		return this.userservice.getusers();
	}
	
	
	
	@PostMapping("/hotelbooking/add-user")
	public User adduser(@RequestBody User user) {
		return this.userservice.adduser(user);
	}
	
	@PutMapping("/hotelbooking/update-user-info")
	public User updateUser(@RequestBody User user) {
		return this.userservice.updateUser(user);
	}
	
	
	@DeleteMapping("/hotelbooking/delete-user-by-id/{hotel_id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String user_id){
		try {
			this.userservice.deleteUser(Long.parseLong(user_id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}

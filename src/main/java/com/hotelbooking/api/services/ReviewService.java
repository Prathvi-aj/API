package com.hotelbooking.api.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelbooking.api.entities.Review;

@Service
public interface ReviewService {

	public List<Review> getreviews();
	public Review updateReview(Review review);
	public Review addreview(Review review);
	public void deleteReview(long review_id);
}

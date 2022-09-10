package com.hotelbooking.api.services;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.api.dao.ReviewDao;
import com.hotelbooking.api.entities.Review;



@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDao reviewDao;
	
	
	@Override
	public List<Review> getreviews() {
		// TODO Auto-generated method stub
		//return list;
		return reviewDao.findAll();
	}

	

	@Override
	public Review addreview(Review review) {
		// TODO Auto-generated method stub
		reviewDao.save(review);
		return review;
	}



	@Override
	public Review updateReview(Review review) {
		// TODO Auto-generated method stub
		reviewDao.save(review);
		return review;
	}



	@Override
	public void deleteReview(long review_id) {
		// TODO Auto-generated method stub
		reviewDao.deleteById(review_id);
		
	}

}

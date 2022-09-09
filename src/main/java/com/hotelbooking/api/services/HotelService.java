package com.hotelbooking.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelbooking.api.entities.Hotel;
import com.hotelbooking.api.entities.Review;

@Service
public interface HotelService {

	public List<Hotel> getHotels();
	public Hotel updateHotel(Hotel hotel);
	public Hotel addHotel(Hotel hotel);
	public void deleteHotel(long hotel_id);
}

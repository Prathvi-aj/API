package com.hotelbooking.api.services;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.api.dao.HotelDao;
import com.hotelbooking.api.entities.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelDao hotelDao;
	
	
	@Override
	public List<Hotel> getHotels(Hotel hotel) {
		// TODO Auto-generated method stub	
		
		return hotelDao.findByCityAndDate(hotel.getcity(),hotel.getDate());
	}

	




	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelDao.save(hotel);
		return hotel;
	}



	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
	hotelDao.save(hotel);
		return hotel;
	}



	@Override
	public void deleteHotel(long hotel_id) {
		// TODO Auto-generated method stub
		hotelDao.deleteById(hotel_id);
	}

}

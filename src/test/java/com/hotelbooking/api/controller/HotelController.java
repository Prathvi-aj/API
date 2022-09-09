package com.hotelbooking.api.controller;


import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotelbooking.api.entities.Hotel;

@RunWith(SpringRunner.class)
public class HotelController {

	@Autowired
	private Hotel hotel;

	
//	@Test
//	public void testgetHotelDetails() throws Exception {
//		
//		Hotel hotel = new Hotel();
//		hotel.setHotel_id(10);
//		hotel.setHotel_name("Orbit");
//		hotel.setRooms(20);
//		hotel.setStars(4);
//		hotel.setDate(new Date(0));
//		hotel.setWifiFacility("true");
//		
//		String inputInJson = this.mapToJson(hotel);
//		
//		String URI = "/hotelbooking/add-hotel";
//		
//	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
}
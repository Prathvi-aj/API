package com.hotelbooking.api.controller;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;
import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotelbooking.api.entities.Hotel;
import com.hotelbooking.api.dao.*;

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class HotelController {


	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	HotelDao hotelDao;
	
	@Test
	public void testgetHotelDetails() throws Exception {
		
		Hotel hotel = new Hotel();
		hotel.setHotel_id(10);
		hotel.setHotel_name("Orbit");
		hotel.setRooms(20);
		hotel.setStars(4);
		hotel.setDate(Date.valueOf("2022-09-09"));
		hotel.setWifiFacility("true");
		
		String inputInJson = this.mapToJson(hotel);
		
		String URI = "/hotelbooking/add-hotel";
		
	}
	@Test
	public void getPatientById_success() throws Exception {

	    mockMvc.perform(MockMvcRequestBuilders
	            .get("/hotelbooking/review")).andExpect(status().isOk());	}	

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
}
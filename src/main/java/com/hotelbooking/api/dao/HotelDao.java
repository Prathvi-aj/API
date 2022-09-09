package com.hotelbooking.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.api.entities.Hotel;


@Repository
public interface HotelDao extends JpaRepository<Hotel, Long> {


}

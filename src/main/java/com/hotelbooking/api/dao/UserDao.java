package com.hotelbooking.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.api.entities.Hotel;
import com.hotelbooking.api.entities.User;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

}

package com.hotelbooking.api.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelbooking.api.entities.User;


@Service
public interface UserService {

	public List<User> getusers();
	public User updateUser(User user);
	public User adduser(User user);
	public void deleteUser(long user_id);
}

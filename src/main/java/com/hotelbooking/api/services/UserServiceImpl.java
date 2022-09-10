package com.hotelbooking.api.services;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.api.dao.UserDao;
import com.hotelbooking.api.entities.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public List<User> getusers() {
		// TODO Auto-generated method stub
		//return list;
		return userDao.findAll();
	}
	

	@Override
	public User adduser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}


	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
	userDao.save(user);
		return user;
	}


	@Override
	public void deleteUser(long user_id) {
		// TODO Auto-generated method stub
		userDao.deleteById(user_id);
	}

}

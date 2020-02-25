package com.slokam.moive.user.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.slokam.moive.user.pojo.User;
import com.slokam.moive.user.repo.UserRepo;

@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserRepo repo;

	public User saveUser(User user) {
		User userDao = null;
		if (user != null) {
			userDao = repo.save(user);
		} else {
			logger.error("input data error Service::: please post the valid information");
		}
		return userDao;
	}
       // hi hello i am from git
	public Optional<User> getUserById(int id) {

		Optional<User> user = repo.findById(id);

		if (user.isPresent()) {
			return user;
		} else {
			logger.error("please gice correct id Service::: can't get information");
		}
		return user;

	}
}

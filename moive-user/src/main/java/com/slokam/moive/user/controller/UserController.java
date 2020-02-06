package com.slokam.moive.user.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.moive.user.pojo.User;
import com.slokam.moive.user.service.UserService;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	@PostMapping("/post/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		ResponseEntity<User> userResponse = null;
		if (user != null) {
			User userDao = userService.saveUser(user);
			userResponse = new ResponseEntity<User>(userDao, HttpStatus.OK);
		} else {
			logger.error("input data error ::: please post the valid information");
			userResponse = new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
		}
		return userResponse;
	}

	@GetMapping("getUser/{id}")
	public Optional<User> getUserById(@PathVariable int id) {

		Optional<User> user = userService.getUserById(id);

		if (user.isPresent()) {
			return user;
		} else {
			logger.error("please gice correct id ::: can't get information");
		}
		return user;

	}

}

package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.User;
import com.learn.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users/get")
	public List<User> getAll() {
		return userService.getAll();
	}

	@PostMapping("/users/add")
	public String addUser(@RequestBody User user1) {
		return userService.addUser(user1);
	}

	@PutMapping("/users/edit")
	public String edit(@RequestBody User user1) {
		return userService.edit(user1);
	}

	@DeleteMapping("/users/delete")
	public String delete(@RequestParam int userNo) {
		return userService.delete(userNo);
	}

}

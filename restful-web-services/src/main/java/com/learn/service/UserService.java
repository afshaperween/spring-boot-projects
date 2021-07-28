package com.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.model.User;
import com.learn.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public List<User> getAll() {
		return userRepo.getAll();
	}

	public String addUser(User user1) {
		return userRepo.addUser(user1);
	}

	public String edit(User user1) {
		return userRepo.edit(user1);
	}

	public String delete(int userNo) {
		return userRepo.delete(userNo);
	}

}

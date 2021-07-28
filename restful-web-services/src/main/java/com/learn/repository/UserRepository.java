package com.learn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learn.model.User;

@Repository
public class UserRepository {

	public List<User> user = new ArrayList<>();

	public List<User> getAll() {
		return user;
	}

	public String addUser(User user1) {
		user.add(user1);
		return "user is successfully added";
	}

	public String edit(User user1) {
		user.stream().filter(e -> e.getId() == user1.getId()).forEach(e -> {
			e.setAddress(user1.getAddress());
			e.setName(user1.getName());
		});
		return "successfully updated";
	}

	public String delete(int userNo) {
		user.remove(userNo - 1);
		return "successfully deleted";
	}

}

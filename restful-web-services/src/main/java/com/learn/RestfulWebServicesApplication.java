package com.learn;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.model.User;
import com.learn.repository.UserRepository;

@SpringBootApplication
public class RestfulWebServicesApplication implements CommandLineRunner {

	@Autowired
	UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(1, "A", "Odisha");
		User u2 = new User(2, "B", "Mumbai");
		User u3 = new User(3, "C", "Kolkata");

		repository.user.addAll(Arrays.asList(u1, u2, u3));

	}
}

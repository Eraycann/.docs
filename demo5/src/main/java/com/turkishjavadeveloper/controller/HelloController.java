package com.turkishjavadeveloper.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkishjavadeveloper.model.User;

@RestController
@RequestMapping(path="/api")
public class HelloController {
	
	// @RequestBody Annotations sayesinde, User modelini karşılaşan bir json gönderilecek ve spring bunu benim user değişkenime atayacaktır.
		// localhost:8080/api/users > Body > raw > JSON
		// bu sayede JSON tipinde veri gönderebiliyoruz.
//		{
//		  "name": "Mustafa",
//		  "surname": "Çetin",
//		  "username": "user1",
//		  "password": "1234"
//		}

	@PostMapping("users")
	public User saveUser(@RequestBody User user) {
		System.out.println("User Saved");
		user.setPassword("");	// aldığımız password bilgisini, boş olarak döndereceğiz.
		return user;
	}
	
	// http://localhost:8080/api/users-all
	// localhost:8080/api/users > Body > raw > JSON
	// bu sayede JSON tipinde veri gönderebiliyoruz.
//	[
//	    {
//	    "name": "Mustafa",
//	    "surname": "Çetin",
//	    "username": "user1",
//	    "password": "1234"
//	    },
//	    {
//	    "name": "Mustafa",
//	    "surname": "Çetin",
//	    "username": "user1",
//	    "password": "1234"
//	    },
//	    {
//	    "name": "Mustafa",
//	    "surname": "Çetin",
//	    "username": "user1",
//	    "password": "1234"
//	    }
//	]

	@PostMapping("users-all")
	public List<User> saveAllUsers(@RequestBody List<User> users) {
		System.out.println("All users Saved");
		users.forEach(user -> user.setPassword(""));
		return users;
	}
}

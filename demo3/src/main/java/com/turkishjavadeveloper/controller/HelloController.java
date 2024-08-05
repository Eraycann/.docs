package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloController {

	// @RequestParam annotation sayesinde > Params > Key/Value şeklinde url oluşacaktır.
	// key = message
	// value = it is my message
	// http://localhost:8080/api/message?message=it is my message
	@GetMapping(path = "/message")
	public String getMyMessage(@RequestParam String message) {
		return "Your message is :" + message;
	}
	
	// key = m
	@GetMapping(path = "/message")
	public String getMyMessage2(@RequestParam("m") String message) {
		return "Your message is :" + message;
	}
}

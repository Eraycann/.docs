package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloController {

	@GetMapping(path = "/message/{message}")
	public String getMyMessage(@PathVariable String message) {
		return "Your message is :" + message;
	}
	
	@GetMapping(path = "/message2/{m}")
	public String getMyMessage2(@PathVariable("m") String message) {
		return "Your message is :" + message;
	}
}

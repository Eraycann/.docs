package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloController {

	// My-Header adında bir Header yoksa STATUS 400, Bad Request almaktayız.
	// @RequestHeader, headerden veri okumamızı sağlayan Annotations'dur.
	// http://localhost:8080/api/header
	// Headers > key/value
	// key : My-Header
	// Biz bu örnekte kendi Header'ımızı yazsak dahi, @RequestHeader annotations sayesinde diğer annotationları okuyabilmekteyiz.
	@GetMapping("/header")
	public String getHeader(@RequestHeader("My-Header") String myHeader) {
		return 	"Your Header is : " + myHeader; 
	}
	
}

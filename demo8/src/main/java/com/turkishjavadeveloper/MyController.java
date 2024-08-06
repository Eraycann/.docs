package com.turkishjavadeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	// @Autowired Annotation sayesinde, Spring IoC Container'da bulunan nesneler, referans değişkenlerim içerisine atanacaktır.
	@Autowired
	private FirstClass firstClass;

	@Autowired
	private SecondClass secondClass;
	
	@GetMapping("/first-class")
	public String getNameOfFirstClass() {
		return firstClass.getName();
	}
	
	@GetMapping("/second-class")
	public String getNameOfSecondClass() {
		return secondClass.getName();
	}
}

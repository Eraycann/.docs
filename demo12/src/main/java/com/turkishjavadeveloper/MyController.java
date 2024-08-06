package com.turkishjavadeveloper;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	// MyController class'ı, MyComponent class'ının bir nesnesine ihtiyaç duymaktadır.
	private MyComponent myComponent;

	public MyController(MyComponent myComponent) {
		this.myComponent = myComponent;
	}	
}

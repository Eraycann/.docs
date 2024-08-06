package com.turkishjavadeveloper;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	public MyComponent() {
		System.out.println("MyComponent been initialized!");
	}
	
	public String getName() {
		return "MyComponent";
	}
}

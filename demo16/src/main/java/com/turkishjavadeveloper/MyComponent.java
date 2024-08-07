package com.turkishjavadeveloper;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	// MyComponent Class'ı bean olarak IoC Container içerisine eklenirken default olarak myComponent adıyla eklenecektir.

	public String getName() {
		return "My name is MyComponent";
	}
}

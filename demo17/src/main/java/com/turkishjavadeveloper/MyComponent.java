package com.turkishjavadeveloper;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestScope
public class MyComponent {
	
	public MyComponent() {
		System.out.println("MyComponent created at " + LocalDateTime.now());
	}

	public String getName() {
		return "MyComponent";
	}
}

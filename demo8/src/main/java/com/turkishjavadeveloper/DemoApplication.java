package com.turkishjavadeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// metot seviyesinde @Bean Annotation vasıtsıyla Spring IoC Container'a nesne ekleme işlemi
	@Bean
	public SecondClass getSecondClass() {
		return new SecondClass();
	}
}

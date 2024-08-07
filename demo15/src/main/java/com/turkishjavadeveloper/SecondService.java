package com.turkishjavadeveloper;

import org.springframework.stereotype.Service;

@Service
public class SecondService {

	private FirstService firstService;

	public SecondService(FirstService firstService) {
		super();
		this.firstService = firstService;
	}
}

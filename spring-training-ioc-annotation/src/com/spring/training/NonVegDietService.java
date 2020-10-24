package com.spring.training;

import org.springframework.stereotype.Component;

@Component
public class NonVegDietService implements DietService {

	@Override
	public String getDiet() {
		return "This is Non veg menu";
	}
}

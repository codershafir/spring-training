package com.spring.training;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class VegDietService implements DietService {

	private String foodItems[] = { "Pulse", "Fruits", "Vegetables" };

	@Override
	public String getDiet() {
		return foodItems[new Random().nextInt(foodItems.length)];
	}
}

package com.practise.springdemo;

import java.util.Random;

public class VegDietService implements DietService {
	
	private String foodItems[] = {
			"Pulse",
			"Fruits",
			"Vegetables"
	};

	@Override
	public String getDiet() {
		return foodItems[new Random().nextInt(foodItems.length)];
	}
}

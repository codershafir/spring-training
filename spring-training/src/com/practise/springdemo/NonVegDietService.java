package com.practise.springdemo;

public class NonVegDietService implements DietService {
	
	@Override
	public String getDiet() {
		return "This is Non veg menu";
	}
}

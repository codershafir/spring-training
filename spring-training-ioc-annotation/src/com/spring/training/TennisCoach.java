package com.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("seaFoodService")
	private DietService dietService;

	@Override
	public String getTraining() {
		return "This is Football Training.";
	}

	public String getDiet() {
		return dietService.getDiet();
	}

}

package com.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SwimmingCoach implements Coach {

	@Autowired
	@Qualifier("italianDietService")
	private DietService dietService;

//	public SwimmingCoach(DietService dietService) {
//		this.dietService = dietService;
//	}

	@Override
	public String getTraining() {
		return "This is Swimming Training." + dietService.getDiet();
	}

}

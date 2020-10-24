package com.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cricketCoachBean")
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("vegDietService")
	private DietService dietService;

//	@Autowired
//	public CricketCoach(DietService dietService) {
//		this.dietService = dietService;
//	}

	@Override
	public String getTraining() {
		return "This is Cricket Training." + dietService.getDiet();
	}

}

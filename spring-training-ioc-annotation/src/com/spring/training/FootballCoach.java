package com.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Autowired
	@Qualifier("nonVegDietService")
	private DietService dietService;

	private DrillService drillService;

	@Autowired
	public void setDrillService(DrillService drillService) {
		this.drillService = drillService;
	}

	@Override
	public String getTraining() {
		return "This is Football Training." + dietService.getDiet();
	}

	public String getDrill() {
		return drillService.getDrill();
	}

}

package com.practise.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class FootballCoachService implements CoachService,DisposableBean {
	
	private DietService dietService;
	
	public void setDietService(DietService dietService) {
		this.dietService = dietService;
	}

	@Override
	public String getTraining() {
		return "This is Football Training";
	}
	
	@Override
	public String getDiet() {
		return dietService.getDiet() + " for football.";
	}
	
	public void onInit() {
		System.out.println("This is onInit method");
	}
	
	public void onDestroy() {
		System.out.println("This is onDetstroy method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy method for prototype bean");
	}

}

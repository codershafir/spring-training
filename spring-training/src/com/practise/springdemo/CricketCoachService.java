package com.practise.springdemo;

public class CricketCoachService implements CoachService {
	
	private DietService dietService;
	
	private String name;
	
	private String email;
	
	public CricketCoachService(DietService dietService) {
		this.dietService = dietService;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}

	@Override
	public String getTraining() {
		return "This is Cricket Training";
	}

	@Override
	public String getDiet() {
		return dietService.getDiet() + " for cricket.";
	}
}

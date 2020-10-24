package com.spring.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.training")
public class SportsConfig {

	@Bean
	public DietService italianDietService() {
		return new ItalianDietService();
	}

	@Bean
	public DietService vegDietService() {
		return new VegDietService();
	}

	@Bean
	public Coach swimmingCoach() {
		return new SwimmingCoach();
	}
}

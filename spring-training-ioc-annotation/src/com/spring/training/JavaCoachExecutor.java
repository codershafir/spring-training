package com.spring.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCoachExecutor {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportsConfig.class);
		Coach cricketCoach = applicationContext.getBean("swimmingCoach", Coach.class);
		System.out.println(cricketCoach.getTraining());
		applicationContext.close();
	}

}

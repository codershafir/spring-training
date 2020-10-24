package com.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachExecutor {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Coach cricketCoach = applicationContext.getBean("cricketCoachBean", Coach.class);
		FootballCoach footballCoach = applicationContext.getBean("footballCoach", FootballCoach.class);
		System.out.println(cricketCoach.getTraining());
		System.out.println(footballCoach.getTraining());
		System.out.println(footballCoach.getDrill());
		applicationContext.close();
	}

}

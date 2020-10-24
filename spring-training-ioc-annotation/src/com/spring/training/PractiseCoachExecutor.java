package com.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseCoachExecutor {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		TennisCoach tennisCoach = applicationContext.getBean("tennisCoach", TennisCoach.class);
		System.out.println(tennisCoach.getTraining());
		System.out.println(tennisCoach.getDiet());
		applicationContext.close();
	}

}

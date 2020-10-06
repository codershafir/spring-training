package com.practise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachExecutor {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoachService c = applicationContext.getBean("cricketCoachService",CricketCoachService.class);
		System.out.println(c.getTraining());
		System.out.println(c.getDiet());
		System.out.println(c.getEmail());
		System.out.println(c.getName());
		applicationContext.close();
	}

}

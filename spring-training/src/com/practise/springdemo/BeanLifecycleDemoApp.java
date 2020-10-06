package com.practise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifecycleContext.xml");
		CoachService c = applicationContext.getBean("footballCoachService",CoachService.class);
		System.out.println(c.getTraining());
		applicationContext.close();
	}

}

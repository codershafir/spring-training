package com.practise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScopeContext.xml");
		CoachService c1 = applicationContext.getBean("footballCoachService",CoachService.class);
		CoachService c2 = applicationContext.getBean("footballCoachService",CoachService.class);
		System.out.println(c1==c2);
		System.out.println(c1);
		System.out.println(c2);
		applicationContext.close();
	}

}

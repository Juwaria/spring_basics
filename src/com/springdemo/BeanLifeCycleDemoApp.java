package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//loading spring config file
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("beanLifeCycle.applicationContext.xml");
		
		//retrieving bean from the spring container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		
	    System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}

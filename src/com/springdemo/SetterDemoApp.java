package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieving bean from spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		//call new method to get the literal values
	    System.out.println(cricketCoach.getEmailAddress());
	    System.out.println(cricketCoach.getTeam());
		//close the context
		context.close();

	}

}

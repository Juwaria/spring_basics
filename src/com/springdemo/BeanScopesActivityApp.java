package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesActivityApp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeActivity.applicationContext.xml");
		
		CricketCoach cricketCoach1 =  context.getBean("myCricketCoach",CricketCoach.class);
		
		CricketCoach cricketCoach2 =  context.getBean("myCricketCoach",CricketCoach.class);
		
		boolean areSame = (cricketCoach1 == cricketCoach2);
		
		System.out.println("\n The two coaches are same: "+areSame);
		
		System.out.println("\n The address of 1st coach is: "+cricketCoach1);
		
		System.out.println("\n The address of 2nd coach is: "+cricketCoach2);

	}

}

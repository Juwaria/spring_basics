package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCopeDemoApp {

	public static void main(String[] args) {
		
		//loading spring config file
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("beanscope.applicationContext.xml");
		
		//retrieving bean from the spring container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		Coach newCoach = context.getBean("myCoach",Coach.class);
		
		//checking if both objects are same
		boolean result = (myCoach==newCoach);
		
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nMemory location of myCoach: "+myCoach);
		
		System.out.println("\nMemory location of newCoach: "+newCoach);
		
		context.close();
	}

}

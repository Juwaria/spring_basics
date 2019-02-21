package com.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k"; 
	}

	@Override
	public String getDailyFortune() {
		return "Today is a good day for a run";
	}
	
	//configured in the xml and is called when the bean is being created
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: insideMethod doMyStartUpStuff");
		
	}
	
	//configured in the xml and is called when the bean is being destroyed
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: insideMethod doMyCleanUpStuff");
		
	}
}

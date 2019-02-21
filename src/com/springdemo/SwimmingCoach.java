package com.springdemo;

public class SwimmingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService theFortuneService) {
		fortuneService =  theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 8 laps.";
	}

	@Override
	public String getDailyFortune() {
		return "Just DO It:"+ fortuneService.getFortune();
	}

}

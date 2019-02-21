package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private FortuneService surpriseFortune;
	
	
	
	private String emailAddress;
	private String team;


	public CricketCoach() {
		System.out.println("Cricket Coach: inside no argument costructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice bowling for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		//return fortuneService.getFortune();
		return surpriseFortune.getFortune();
	}

	//setter method: called by spring to inject dependency
	/*public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
*/
	//setter method: called by spring to literal value
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	//setter method: called by spring to literal value
	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method - setTeam");
		this.team = team;
	}
	public void setSurpriseFortune(FortuneService surpriseFortune) {
		this.surpriseFortune = surpriseFortune;
	}

}

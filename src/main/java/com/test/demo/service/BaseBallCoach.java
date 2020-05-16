package com.test.demo.service;

public class BaseBallCoach implements Coach{
	
	Fortune fortune;
	
	public BaseBallCoach(Fortune fortuneService) {
		fortune= fortuneService;
	}
	
	public String getWorkoutDetails() {
		return "Do batting for 2 hours";
	}

	public String getDailyFortune() {
		return fortune.getFortune();
	}
	
	

}

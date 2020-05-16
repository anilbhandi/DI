package com.test.demo.service;

public class RunningCoach implements Coach{
	
	Fortune myFortune;
	
	String emailid;
	
	String name;
	
	// Constructor injection	
	//	public RunningCoach(Fortune fortuneService) {
	//		fortune = fortuneService;
	//	}
	
	public void setMyFortune(Fortune fortune) {
		this.myFortune = fortune;
	}
	
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public String getWorkoutDetails() {
		return "Run for 1 hour daily  " + "My details:" + getEmailid() + "  My Name:" + getName();
		
	}

	public String getDailyFortune() {
		return myFortune.getFortune();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}

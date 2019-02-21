package com.springdemo;

import java.util.Random;

public class SurpriseFortuneService implements FortuneService {
	
	private String[] fortunes = {"Today is going to be super fun",
								"Something miraculous is going to happen ",
								"You can do this!"};

	@Override
	public String getFortune() {
	    Random rand = new Random();
	    int index =  rand.nextInt(fortunes.length);
	    return fortunes[index];
	}

}

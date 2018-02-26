package edu.utn.frro.ma.ideal.moodystudent;

import java.util.Random;

public class QuoteService {

	public String getQuote() {
		Random random = new Random();
		if (random.nextBoolean()) {
			return "Genius is one percent inspiration and ninety-nine percent perspiration. Thomas A. Edison. ";
		} else {
			return "Be yourself; everyone else is already taken. Oscar Wilde. ";
		}
		
	}
}

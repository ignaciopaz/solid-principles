package edu.utn.frro.ma.ideal.moodystudent;
/* 5: Let’s Implement: Create a class that implements the Mood interface for each mood variation.
Altenative step 5.c  Alternative Step: One variation needs to use another class, service or interface.
 */
public class Inspired implements Mood {
	QuoteService quoteService;
	public Inspired(QuoteService quoteService) {
		this.quoteService=quoteService;
	}
	public String speak() {
		return quoteService.getQuote();		
	}

}

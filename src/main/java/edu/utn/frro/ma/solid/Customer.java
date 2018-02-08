package edu.utn.frro.ma.solid;

public class Customer implements Feedable {

	private String creditCard;

	public Customer(String creditCard) {
		this.creditCard=creditCard;
	}

	public String eat() {
		return "I pay to eat. Charge it to my credit card "+creditCard;
	}

}

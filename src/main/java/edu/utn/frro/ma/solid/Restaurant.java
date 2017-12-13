package edu.utn.frro.ma.solid;

import java.util.ArrayList;
import java.util.Collection;

public class Restaurant {

	private Diner[] diners;
	
	public void serveFood() {
		System.out.println("### Serving delicious food! ###");
		for (Diner diner : diners) {
			System.out.println(diner.eat());
		}
	}
	
	public Restaurant(Diner... diners) {
		this.diners=diners;
	}
	
}

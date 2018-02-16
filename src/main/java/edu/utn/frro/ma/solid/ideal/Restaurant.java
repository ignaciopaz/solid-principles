package edu.utn.frro.ma.solid.ideal;

import java.util.ArrayList;
import java.util.Collection;

public class Restaurant {

	private Feedable[] feedables;
	
	public void serveFood() {
		System.out.println("### Serving delicious food! ###");
		for (Feedable feedable : feedables) {
			System.out.println(feedable.eat());
		}
	}
	
	public Restaurant(Feedable... feedables) {
		this.feedables=feedables;
	}
	
}

package edu.utn.frro.ma.solid;

import java.util.ArrayList;
import java.util.Collection;

public class Company {

	private Worker[] workers;
	
	public Company(Worker... workers) {
		this.workers=workers;
	}
	
	public void makeMoney() {
		System.out.println("### Making this company great! ###");
		for (Worker worker : workers) {
			System.out.println(worker.work());
		}
		System.out.println("### Take a break of work. ###");
	}	
	
}

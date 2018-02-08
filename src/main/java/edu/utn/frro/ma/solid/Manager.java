package edu.utn.frro.ma.solid;

import java.util.ArrayList;
import java.util.Collection;

public class Manager {

	private Workable[] workers;
	
	public Manager(Workable... workers) {
		this.workers=workers;
	}
	
	public void makeMoney() {
		System.out.println("### Making this company great! ###");
		for (Workable worker : workers) {
			System.out.println(worker.work());
		}
		System.out.println("### Take a break of work. ###");
	}	
	
}

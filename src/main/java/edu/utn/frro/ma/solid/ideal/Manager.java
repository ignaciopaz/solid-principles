package edu.utn.frro.ma.solid.ideal;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Collection;

public class Manager implements Workable {

	private Workable[] workers;
	
	public Manager(Workable... workers) {
		this.workers=workers;
	}
	
	public String work() {
		System.out.println("### Making this company great! ###");
		for (Workable worker : workers) {
			System.out.println(worker.work());
		}
		System.out.println("### Take a break of work. ###");
		return "good job";
	}

	public Workable[] getWorkers() {
		return workers;
	}	
	
}

package edu.utn.frro.ma.solid;

import java.util.Collection;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Collection<StandardWorker> standardWorkers = new LinkedList<StandardWorker>();
		Collection<SuperWorker> superWorkers = new LinkedList<SuperWorker>();
		Collection<Workable> workers = new LinkedList<Workable>();
		Collection<Feedable> diners = new LinkedList<Feedable>();
		
		for (int i=0; i< 3; i++)
			superWorkers.add(new SuperWorker());
		
		standardWorkers.add(new StandardWorker("Joe"));
		standardWorkers.add(new StandardWorker("Juan"));
		standardWorkers.add(new StandardWorker("Jane"));
		standardWorkers.add(new StandardWorker("David"));
		standardWorkers.add(new StandardWorker("Julie"));
		
		for (int i=1; i<=4; i++)
			workers.add(new Robot(i));
		
		diners.add(new Customer("1234"));
		diners.add(new Customer("5678"));
		diners.add(new Customer("9012"));
		
		diners.addAll(standardWorkers);
		diners.addAll(superWorkers);
		
		workers.addAll(standardWorkers);
		workers.addAll(superWorkers);
		Main main = new Main();
	
		main.startWorkDay(workers, diners);
	}

	private void startWorkDay(Collection<Workable> workers, Collection<Feedable> diners) {
		Manager manager = new Manager(workers);
		Restaurant restaurant = new Restaurant(diners);
		
		manager.makeMoney();
		restaurant.serveFood();
	}

}

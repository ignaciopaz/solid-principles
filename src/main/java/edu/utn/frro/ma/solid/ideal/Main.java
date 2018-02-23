package edu.utn.frro.ma.solid.ideal;

import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		WorkTask automatedWork = new WorkTaskAutomated();
		WorkTask highPerformanceWork = new WorkTaskHighPerformance();
		WorkTask standardWork = new WorkTaskStandard();
		EatHabit eatStandard = new EatHabitStandard();
		EatHabit eatSuper = new EatHabitSuper();
		
		Worker super1 = new Worker("Super1", highPerformanceWork, eatSuper);
		Worker super2 = new Worker("Super2", highPerformanceWork, eatSuper);
		Worker super3 = new Worker("Super3", highPerformanceWork, eatSuper);
		Robot r1 = new Robot(1, automatedWork);
		Robot r2 = new Robot(2, automatedWork);
		Robot r3 = new Robot(3, automatedWork);
		Robot r4 = new Robot(4, automatedWork);
		Worker sw1 = new Worker("Joe", standardWork, eatStandard);
		Worker sw2 = new Worker("Juan", standardWork, eatStandard);
		Worker sw3 = new Worker("Jane", standardWork, eatStandard);
		Worker sw4 = new Worker("David", standardWork, eatStandard);
		Worker sw5 = new Worker("Julie", standardWork, eatStandard);
		
		Worker efficient1 = new Worker("efficient1", highPerformanceWork, eatStandard);
		Worker efficient2 = new Worker("efficient2", highPerformanceWork, eatStandard);
		
		Manager manager = new Manager(r1, super1, sw1, sw5, r4, sw2, r2, super2, r3, sw3, super3, sw4, efficient1, efficient2);
		Restaurant restaurant = new Restaurant(super1, sw1, sw2, super2, sw3, sw4, sw5, super3, efficient1, efficient2);
		
		manager.work();
		restaurant.serveFood();
		
	
		

	}

}

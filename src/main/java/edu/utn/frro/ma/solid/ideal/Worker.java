package edu.utn.frro.ma.solid.ideal;

public class Worker implements Workable, Feedable {
	private String name;
	private WorkTask workTask;
	private EatHabit eatHabit;
	
	public String work() {
		return name+": "+ workTask.perform();
	}

	public String eat() {
		return name+": "+ eatHabit.eat();
	}

}

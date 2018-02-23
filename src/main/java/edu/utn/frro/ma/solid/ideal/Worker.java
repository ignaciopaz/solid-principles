package edu.utn.frro.ma.solid.ideal;

public class Worker implements Workable, Feedable {
	private String name;
	private WorkTask workTask;
	private EatHabit eatHabit;
	
	public Worker(String name, WorkTask workTask, EatHabit eatHabit) {
		this.name=name;
		this.workTask = workTask;
		this.eatHabit = eatHabit;
	}

	public String work() {
		return name+": "+ workTask.perform();
	}

	public String eat() {
		return name+": "+ eatHabit.eat();
	}

}

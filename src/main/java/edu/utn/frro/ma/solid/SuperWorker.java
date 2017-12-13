package edu.utn.frro.ma.solid;

public class SuperWorker implements Worker, Diner {

	public String work() {
		return "I am working real fast and I am super efficient. I am like " + this.toString();
	}

	public String eat() {
		return "I am eating steroids. I am like " + this.toString();
	}

}

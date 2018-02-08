package edu.utn.frro.ma.solid;

public class StandardWorker implements Workable, Feedable {

	private String name;

	public StandardWorker(String name) {
		this.name=name;
	}

	public String work() {
		return name+": I am working";
	}

	public String eat() {
		return name+": I am eating";
	}

}

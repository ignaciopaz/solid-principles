package edu.utn.frro.ma.solid;

public class Robot implements Worker{

	private Integer unitNumber;
	public Robot(Integer unitNumber) {
		this.unitNumber=unitNumber;
	}

	public String work() {
		return "I am unit "+unitNumber+". I work automated all the time";
	}

}

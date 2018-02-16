package edu.utn.frro.ma.solid.ideal;

public class Robot implements Workable{
	private WorkTask workTask;
	private Integer unitNumber;
	public Robot(Integer unitNumber) {
		this.unitNumber=unitNumber;
	}

	public String work() {
		return "I am unit "+unitNumber+". " + workTask.perform();
	}

}

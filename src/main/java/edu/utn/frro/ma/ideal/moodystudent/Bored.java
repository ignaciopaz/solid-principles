package edu.utn.frro.ma.ideal.moodystudent;
//5: Let’s Implement: Create a class that implements the Mood interface for each mood variation.
public class Bored implements Mood {
	private Student student;
	public Bored(Student student) {
		this.student=student;
	}
	public String speak() {
		//return a string as simplification of a possible more complex logic
		return "I live in " + student.getCity() +", I do not know what do. ";
	}

}

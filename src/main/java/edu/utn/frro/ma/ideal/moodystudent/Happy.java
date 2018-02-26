package edu.utn.frro.ma.ideal.moodystudent;
//5: Let’s Implement: Create a class that implements the Mood interface for each mood variation.
public class Happy implements Mood {
	private Student student;
	public Happy(Student student) {
		this.student=student;
	}
	public String speak() {
		//return a string as simplification of a possible more complex logic
		return "My name is " + student.getName() +", life is wonderful. ";
	}

}

package edu.utn.frro.ma.ideal.moodystudent;

public class Main {

	public static void main(String[] args) {		
		Student student = new Student("John", "LA");
		
		Mood happy = new Happy(student);
		student.setMood(happy);
		System.out.println("Happy: " + student.speak());	
		
		Mood bored = new Bored(student);			
		student.setMood(bored);
		System.out.println("Bored: " + student.speak());
		
		Mood inspired = new Inspired(new QuoteService());
		student.setMood(inspired);
		System.out.println("Inspired: "+student.speak());
		
		Mood compositeMood = new CompositeMood(happy, inspired);
		student.setMood(compositeMood);
		System.out.println("Composite "+student.speak());

	}

}

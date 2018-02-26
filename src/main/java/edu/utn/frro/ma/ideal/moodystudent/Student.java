package edu.utn.frro.ma.ideal.moodystudent;

public class Student {
	private String name;
	private String city;
	private Mood mood; //4: Associate ("Favor object composition over class inheritance").
	
	public Student(String name, String city) {
		this.name=name;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	
	//1: Identify: the varying behavior ("Consider what should be variable in your design")
	//2: Do not apply inheritance
	public String speak() {
		return mood.speak();
	}
	public void setMood(Mood mood) {
		this.mood=mood;		
	}
}

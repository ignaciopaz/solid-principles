package edu.utn.frro.ma.solid;

public class Main {

	public static void main(String[] args) {
		
		SuperWorker s1 = new SuperWorker();
		SuperWorker s2 = new SuperWorker();
		SuperWorker s3 = new SuperWorker();
		Robot r1 = new Robot(1);
		Robot r2 = new Robot(2);
		Robot r3 = new Robot(3);
		Robot r4 = new Robot(4);
		StandardWorker sw1 = new StandardWorker("Joe");
		StandardWorker sw2 = new StandardWorker("Juan");
		StandardWorker sw3 = new StandardWorker("Jane");
		StandardWorker sw4 = new StandardWorker("David");
		StandardWorker sw5 = new StandardWorker("Julie");
		Customer c1 = new Customer("1234");
		Customer c2 = new Customer("5678");
		Customer c3 = new Customer("9012");
		
		Manager manager = new Manager(r1, s1, sw1, sw5, r4, sw2, r2, s2, r3, sw3, s3, sw4);
		Restaurant restaurant = new Restaurant(c1, s1, sw1, sw2, c2, s2, c3, sw3, s3, sw4, sw5);
		
		manager.makeMoney();
		restaurant.serveFood();
		

	}

}

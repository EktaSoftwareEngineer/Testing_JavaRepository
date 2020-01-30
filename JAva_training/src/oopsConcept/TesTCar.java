package oopsConcept;

public class TesTCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		// compile time polymorphism 
		
		b.start();// Method overriding when same method present in parent and child class
		b.thefSafety();
		b.stop();// call from parents 
		b.refill();// call from parent call 
		Car c= new Car();
		c.start();
		c.stop();
		c.refill();
		//c.threadshefty from BMW as it is not 
		System.out.println("*********************");
		Car c1 = new BMW();// this is dynamic polymorphism 
		c1.start();
		c1.stop();// cannot call thread safety feature 
		c1.engine();
		// BMW b1 =(BMW)new Car();// casting of class and will give you error msg classCAST Exception
		
	}

}


public class MethodOverRidding extends MethodOver{

	public static void main(String[] args) {
		MethodOver a = new MethodOver();   // Animal reference and object
		MethodOver b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	   }
		
		
	}

// you cannot create method in method 
// duplicate method with same number of arguments with the same class is not allowed
// method overloading --> When the method name is same with different arguments or input parameters within the same class.
// c

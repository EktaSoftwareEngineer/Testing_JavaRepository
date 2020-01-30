package constructorConcept;

public class Constructor_concept {
	
	public Constructor_concept() {
		System.out.println("Default constr, doesnt have void or static not passing anything ");
	}
	public Constructor_concept(int i) {
		System.out.println("parametrise constr" +i);
	}
	public Constructor_concept(int i, String s) {
		System.out.println("overload constr 2. two para constructor" +i +s );
	}
	public static void main(String[] args) {
		
		// calling the constructor 
		Constructor_concept obj = new Constructor_concept();// default constructor 
		Constructor_concept obj1 = new Constructor_concept(5);
		Constructor_concept obj2 = new Constructor_concept(5, " Agama");
		// lets comment 2 and 3rd constructor. you will get warning for line 18 n 19 but not for 17
		// use of super and passing parameter in the super key word keyword for constructor by using super and the by creating ref of class 
	
	}

}

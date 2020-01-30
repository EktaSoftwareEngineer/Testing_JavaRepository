
public class StaticAndNonStaticConcept {

	
	String name ="agama";// non static global variable
	static int age =25;// static global variable
	
	public static void main(String[] args) {
	// how to call static methods and variables?
	
		add();//1. direct calling 
		StaticAndNonStaticConcept.add();//2. calling by classnames.
		System.out.println(age);
	//	System.out.println(name);this will give error 
		// non static method should be called by the class name.
		// to access name I need to create the obj of the class and access
		StaticAndNonStaticConcept sc = new StaticAndNonStaticConcept();
		System.out.println(sc.name);
		sc.sendMail();// calling method by the class obj 
		
	}
	public void sendMail() {// non static method
		System.out.println("send mail method");
	}
	public static void add() {// static method
		System.out.println("send mail method");
	}

}

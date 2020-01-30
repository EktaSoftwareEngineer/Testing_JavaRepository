package diffFinalFinally;

public class ParentClass {
	 // so in case you want to prevent inherent 
	// public final class ParentClass -> it is at class level 
	
	// at method level when used final it will prevent overriding 
	public void start() {
	//public final void start(){
		 System.out.println("hello");
	 }

}

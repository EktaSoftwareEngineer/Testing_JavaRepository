package diffFinalFinally;

public class FinalizeConcept {
		/*public void finalize() {
			System.out.println("Finally method");
		}*/
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		f1= null;
		f2 = null;
		
		System.gc();// direct calling garbage collectors 
		
		// final is keyword 
		// finally is block 
		// finalize method -> is clean up process before system.gc method 
		
		
	}

}

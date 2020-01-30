package diffFinalFinally;

public class FinallyConcept {
// lets declare as static so we call directly in main method 
	
	public static void main(String[] args) {
		test1();
	}
		public static void test1() {
		try {
			System.out.println(" just to see that whatever happens finally will be executed ");
		}catch (Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
			}
	
		}
	
	}



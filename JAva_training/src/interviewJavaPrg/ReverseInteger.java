package interviewJavaPrg;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 6764;// make it long so you cans store long number 
		int rev = 0;
		while(num!=0) {
			rev =rev * 10+ num % 10;//
			num =num/10;
		}
		System.out.println("reverse number is ::"+ rev );
		
		// using String buffer method 
		long num1 =343443431;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}


public class FirstJava {

	public static void main(String[] args) {
		
		String a ="hello Agama QA Batch";
		String b = " hi ";
		System.out.println( a+b );
		
		int i = 10;
		int j = 15;
		int k = i+j;
		System.out.println(" the sum of two int is " + k);
		
		String ab = "hello";
		String ab1 = "hello";
		
		System.out.println(ab.length());
		int q = ab.length();
		int x = ab1.length();
		boolean st = ab==ab1;
		System.out.println(st);
		System.out.println(ab.toLowerCase());
		System.out.println(ab.toUpperCase());
		
		System.out.println(ab.concat(ab1));
		//ab.indexOf("many");
		//ab.concat(ab1);
		
			int len = ab.length();
			String rev = "";
			for(int ir =len-1;ir>=0;ir--) {
				rev = rev +ab.charAt(ir);
			}
		System.out.println(rev);
		
	
	// by string buffer class 
	StringBuffer sf = new StringBuffer(ab);
	System.out.println(sf.reverse());
	
	}
}


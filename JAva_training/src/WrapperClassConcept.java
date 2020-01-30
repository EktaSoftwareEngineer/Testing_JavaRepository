
public class WrapperClassConcept {

	public static void main(String[] args) {
		String x= "100";
		//System.out.println(x+20);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from int to String

			at WrapperClassConcept.main(WrapperClassConcept.java:6)*/
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// String to double conversions
		String y= "12.15";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		// int to String conversion 
		int j= 200;
		System.out.println(j+20);
		// we have method which will convert the int into string 
		
		String s = String.valueOf(j);
		System.out.println(s+ 20);
		
		
		String u= "100A";
		Integer.parseInt(u);// will give numberformatException ---for input string "100A"
		//System.out.println(u);//Exception in thread "main" java.lang.NumberFormatException: For input string: "100A"

	}

}

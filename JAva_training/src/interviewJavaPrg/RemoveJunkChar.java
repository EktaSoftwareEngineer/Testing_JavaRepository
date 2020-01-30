package interviewJavaPrg;

public class RemoveJunkChar {

	public static void main(String[] args) {
		String s =" ui*#r##!~ my first java program 8547857454723%$";
		// Regular Expression [^0-zA-20-9]","");
		s= s.replaceAll("[^0-zA-Z0-9]","");
		System.out.println(s);
		

	}

}

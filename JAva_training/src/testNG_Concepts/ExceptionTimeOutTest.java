package testNG_Concepts;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut =2000)
	public void infinitLoopTest() {
		int i= 1;
		while(i == 1) {
			System.out.println(i);
	}
	}
@Test(expectedExceptions = NumberFormatException.class)
	public void testException() {
	String x= "121A";
		Integer.parseInt(x);
	}
	
}

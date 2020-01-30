package testNG_Concepts;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	// dependsOnMethod// try with priority
	
	@Test(dependsOnMethods ="testTwo" )
	public void testOne() {
		System.out.println("the test one");
	}
	@Test
	public void testTwo() {
		System.out.println("the test two");
		//int i =9/0;
	}

}

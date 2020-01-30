package testNG_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConceptTest {
	// try without entering softAssert
	// if the hard assert is failing then immediately the test case will be marked failed
	// if soft assert is failing it will be not marked failed and next line will 
	//be executed but softAssertALL will mark test case as failed 
	
	SoftAssert softAssert = new SoftAssert();
	
	
	@Test
	public void SoftTest(){
		System.out.println("Open Browser");
		Assert.assertEquals(true, false);
		// step 2 
		Assert.assertEquals(true, true);   //hard Assert
		System.out.println("enter username ");
		System.out.println("enter password ");
		System.out.println("click on sign in button");
		Assert.assertEquals(true, false,"homepage");
		// step 2 
		Assert.assertEquals(true, true);
		System.out.println("validate home page");
		//softAssert.assertEquals(true,false);
		
		System.out.println("go to deal page");
		System.out.println("create a deal");
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		// Step 2
		softAssert.assertAll();	
	}
	@Test
	public void test2() {
		System.out.println("hello");
	}
	
}

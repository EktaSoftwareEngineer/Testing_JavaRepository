package testNG_ScrnShot_Fail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShortOfFailedTestCase extends Base{
	
	@BeforeMethod 
	public void setUp() {
		initialization();
		
	}

	@AfterMethod 
	public void tearDown() {
		driver.quit();
		
	}
	
	@Test
	public void takeScreenShortTest() {
		Assert.assertEquals(false, true);
		
	}
	
}

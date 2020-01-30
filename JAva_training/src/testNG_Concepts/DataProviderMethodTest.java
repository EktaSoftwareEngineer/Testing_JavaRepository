package testNG_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethodTest {
	// data is coming from the excel file and we use data provider annotation
	WebDriver driver;
	
	@DataProvider
	public void getTestData() {
		
	}
	
	
	@Test
	public void GoogleLogin() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Ekta Kumar\\eclipse-workspace\\JAva_training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.name("firstname")).sendKeys("hello");
		driver.findElement(By.name("lastname")).sendKeys("tello");
		driver.findElement(By.name("email")).sendKeys("abs@gmail.com");
		driver.quit();
	}
	
	

}

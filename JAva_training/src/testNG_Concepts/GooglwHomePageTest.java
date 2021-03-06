package testNG_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglwHomePageTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		
		//C:\Users\Ekta Kumar\eclipse-workspace\JAva_training\Drivers
		System.setProperty("webdriver.chrome.driver", "\\Users\\Ekta Kumar\\eclipse-workspace\\JAva_training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("the title of the page is " + title);
		Assert.assertEquals(title, "Google","title is not matched");// try with google123
	}
	
	@Test
	public void testGoogleLogo() {
		//boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	 boolean b = driver.findElement(By.xpath("//*[@id ='hplogo']")).isDisplayed();
	 Assert.assertTrue(b);
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}

package testNG_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	// ****this test has a xml file named test1ng.xml****
	WebDriver driver;
	

	@Test
	@Parameters({"env","browser","url"})
	public void GoolgeLoginTest(String env, String browser ,String url) {
		if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "\\Users\\Ekta Kumar\\eclipse-workspace\\JAva_training\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\Users\\Ekta Kumar\\eclipse-workspace\\JAva_training\\Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
			
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(url);
		String title = driver.getTitle();
		System.out.println("the title of the page is " + title);
		Assert.assertEquals(title, "Google","title is not matched");// try with google123
	
		driver.quit();
		}

		
	}


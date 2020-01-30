package java_testcase_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		String basefolder = "\\Users\\Ekta Kumar\\eclipse-workspace\\JAva_training\\Drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",  basefolder);
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

		driver.findElement(By.id("gsr")).sendKeys("Java");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java")){
				list.get(i).click();
				break;
			}
		
		}
		driver.close();
	}

}
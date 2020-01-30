package java_testcase_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "\\Users\\Ekta Kumar\\eclipse-workspace\\JAva_training\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.edureka.co/");
		TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
	System.out.println("the Screenshot is taken");
	driver.quit();
	}

}

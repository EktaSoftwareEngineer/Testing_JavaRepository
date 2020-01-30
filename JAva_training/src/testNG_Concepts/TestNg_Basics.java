package testNG_Concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_Basics {
	/*
	 *@BeforeSuite -->used for setting up property
	@BeforeClass -->this launch the Browser
	@BeforeMethod --->enter the url
	@Test --> Google title app
	@AfterMethod -->login method
	@AfterMethod -->logout from the system - second last
	@AfterTest--> delete all cookies last 
	 */
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite -->used for setting up property");
	}

	@BeforeClass // 2
	public void luanchBrowser() {
		System.out.println("@BeforeClass -->this launch the Browser");
	}

	@BeforeMethod // 3
	public void enterUrl() {
		System.out.println("@BeforeMethod --->enter the url");
	}
	@Test // 4
	public void googleTitleTest() {
		System.out.println("@Test --> Google title app");
	}
	@AfterMethod // 5
	public void login() {
		System.out.println("@AfterMethod -->login method");
	}
	@AfterMethod
	public void logoutMethod() {
		System.out.println("@AfterMethod -->logout from the system - second last");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest--> delete all cookies last ");
	}
	@AfterSuite
	public void cleanTest() {
		System.out.println("@AfterSuite -->this will not run ");
	}
}

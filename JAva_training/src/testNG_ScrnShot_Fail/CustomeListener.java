package testNG_ScrnShot_Fail;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListener extends Base implements ITestListener{
	public void onTestStart(ITestResult result) {

	}
	public void onTestSucess(ITestResult result) {

	}
	public void onTestFailure(ITestResult result) {
		System.out.println("the test is getting failed ");
		failed();
	}
	public void onTestSkipped(ITestResult result) {

	}
	
}

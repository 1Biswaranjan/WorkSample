package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersInterface implements ITestListener{

	public void onStart(ITestContext args)
	{
		System.out.println("test start");
	}
	
	public void onFinish(ITestContext args)
	{
		System.out.println("test finish");
	}
	
	public void onTestStart(ITestResult args)
	{
		System.out.println("testcase start");
	}
	
	public void onTestSuccess(ITestResult args)
	{
		System.out.println("testcase pass");
	}
	
	public void onTestFailure(ITestResult args)
	{
		System.out.println("testcase fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
}



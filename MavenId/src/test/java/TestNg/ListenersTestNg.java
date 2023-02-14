package TestNg;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg.ListenersInterface.class)
public class ListenersTestNg {

	@Test()
	void test1() 
	{
		
		System.out.println("Hello");
	}
	
	
	@Test()
	void test2() 
	{
		
		System.out.println("hiii");
		Assert.fail();
	
	}
	
}

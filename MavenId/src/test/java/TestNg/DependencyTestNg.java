package TestNg;


import org.testng.Assert;
import org.testng.annotations.Test;


public class DependencyTestNg {

	@Test()
	void m1()
	{
		Assert.fail();

		System.out.println("Hello");
	}
	
	@Test(dependsOnMethods= {"m1"},alwaysRun=true)
	void m2()
	{
		System.out.println("Hii");
	}
	 
	@Test(dependsOnMethods= {"m2"})
	void m3()
	{
		System.out.println("HUUU");
	}
	
	@Test
	void m4()
	{
		System.out.println("Heee");
	}
	
}

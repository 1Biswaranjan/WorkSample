package TestNg;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite()
	void m1() {

		System.out.println("before suite");
	}
	
	@AfterSuite()

	void m2() {

		System.out.println("after suite");
	}
	
	
	@BeforeTest()
	void m3() {

		System.out.println("before test");
	}
	
	@AfterTest()

	void m4() {

		System.out.println("after test");
	}
	
	@BeforeClass()
	void m5() {

		System.out.println("before class");
	}
	
	@AfterClass()
	void m6() {

		System.out.println("after class");
	}
	
	@BeforeGroups()
	void m7() {

		System.out.println("before groups");
	}
	
	@AfterGroups()
	void m8() {

		System.out.println("after groups");
	}
	
	@BeforeMethod()
	void m9() {

		System.out.println("before methods");
	}
	
	@AfterMethod()
	void m10() {

		System.out.println("after methods");
	}
	
	@Test()
	void test1()
	{
		System.out.println("test1");

	}
	
	@Test()
	void test2()
	{
		System.out.println("test2");

	}
}

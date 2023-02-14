package TestNg;

import org.testng.annotations.Test;

public class AccessDataProviderAnotherClass {

	@Test(dataProvider = "Countries" , dataProviderClass=DataProviderAnotherClass.class)
	void countriesTest(String country)
	{
		System.out.println(country);
	}
	
}

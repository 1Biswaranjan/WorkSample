package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNg {

	@Test(dataProvider = "Countries")
	void countryTest(String country)
	{
		System.out.println(country);
	}
	
	@DataProvider(name="Countries")
	public Object[] getData()
	{
		Object[] data={"India","England","Japan"};
		return data ;
	}
	
	
}

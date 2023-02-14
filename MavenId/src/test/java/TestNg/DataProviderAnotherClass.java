package TestNg;

import org.testng.annotations.DataProvider;

public class DataProviderAnotherClass {

	@DataProvider(name = "Countries")
	public Object[] getData()
	{
		Object[] data = {"Japan", "Usa" , "China" ,  "India"};
		return data ;
	}
	
}

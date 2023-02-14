package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNg {

	@Test
	@Parameters({"Countries"})
	void countryTest(String country)
	{
		System.out.println(country);
	}
	
	
}

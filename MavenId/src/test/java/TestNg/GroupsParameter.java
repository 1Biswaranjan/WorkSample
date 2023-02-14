package TestNg;

import org.testng.annotations.Test;

public class GroupsParameter {

	@Test(groups = "regression")
	void login()
	{
		System.out.println("login");

	}
	
	@Test(groups = "smoke" )
	void openBroweser()
	{
		System.out.println("openBroweser");

	}
	
	@Test( groups = "regression")
	void sendAnEmail()
	{
		System.out.println("sendAnEmail");

	}
	
	@Test(groups = {"sanity","smoke"})
	void registration()
	{
		System.out.println("registration");

	}
	
	@Test(groups = "smoke")
	void logOut()
	{
		System.out.println("logOut");

	}
	
}

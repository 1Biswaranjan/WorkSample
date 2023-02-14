package TestNg;


import org.testng.annotations.Test;

public class PriorityParameter {
	
			
			@Test(priority = 2)
			void login()
			{
				System.out.println("login");

			}
			
			@Test(priority = 0 )
			void openBroweser()
			{
				System.out.println("openBroweser");

			}
			
			@Test(priority = 3 )
			void sendAnEmail()
			{
				System.out.println("sendAnEmail");

			}
			
			@Test(priority = 1)
			void registration()
			{
				System.out.println("registration");

			}
			
			@Test(priority = 4)
			void logOut()
			{
				System.out.println("logOut");

			}
		}


package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class MainClassForRegistratiion {

	@Test
	 void registration() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		RegistrationIdentification reg =new RegistrationIdentification(driver);
		reg.clickCreateNewAccount(); 
		Thread.sleep(1000);
		reg.firstName("Atish");
		reg.lastName("Sam");
		reg.mailId("Atish@gmail.com");
		reg.confirmMailId("Atish@gmail.com");
		reg.password("Atish@123");
		Thread.sleep(1000);
		reg.dropDown("28","11","1998");
		/*reg.birhDay("28");
		reg.birthMonth("November");
		reg.birthYear("1998");*/
		
		reg.gender();
		reg.submit();

	}
	
	/*public static void main(String[] args) throws InterruptedException {
		MainClassForRegistratiion regis = new MainClassForRegistratiion();
		regis.registration();*/
	}



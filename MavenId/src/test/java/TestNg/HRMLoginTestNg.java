package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

public class HRMLoginTestNg {
	
	@Test()

		void login() throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);	
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
	
	  }




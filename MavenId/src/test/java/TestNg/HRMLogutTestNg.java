package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HRMLogutTestNg {

  @Test()
	  
	  void logout() throws InterruptedException
	  {
			System.setProperty("webdriver.chrome.driver", "H://Java With Chiru/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);	
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    WebDriverWait wt = new WebDriverWait(driver,30);
		    wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='oxd-userdropdown-name']")));
	        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		    Thread.sleep(500);
		    driver.findElement(By.linkText("Logout")).click();
	
}
}

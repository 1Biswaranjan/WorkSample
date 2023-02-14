package seleniumex;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForCompose {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    WebDriverWait wt= new WebDriverWait(driver, 20);
	    wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Admin"))));
	    driver.findElement(By.linkText("Admin")).click();
	    
	/*    WebDriverWait wt = new WebDriverWait(driver,30);
	    wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='oxd-userdropdown']")));
       driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).click();
	    Thread.sleep(1000);
       driver.findElement(By.linkText("Logout")).click();*/
        

		
		
}
}

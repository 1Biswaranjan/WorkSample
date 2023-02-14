package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginWithFirefoxDriver {
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\Manual Testing\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Atish");
		driver.findElement(By.name("lastname")).sendKeys("Sam");
		driver.findElement(By.name("reg_email__")).sendKeys("Atish@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Atish@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Atish@123");
		driver.findElement(By.name("birthday_day")).sendKeys("28");
		driver.findElement(By.name("birthday_month")).sendKeys("November");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		driver.findElement(By.xpath("//input[@value=2]")).click();
		driver.findElement(By.name("websubmit")).click();
}
}

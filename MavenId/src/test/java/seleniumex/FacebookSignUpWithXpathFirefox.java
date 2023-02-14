package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignUpWithXpathFirefox {

	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\Manual Testing\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Atish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Atish@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Atish@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Atish@123");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("28");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("November");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1998");
		driver.findElement(By.xpath("//input[@value=2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
}
}


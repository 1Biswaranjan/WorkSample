package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreationLinkdinFirefoxDriver {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\Manual Testing\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/home");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Join now")).click();
		driver.findElement(By.name("email-or-phone")).sendKeys("7008346957");
		//driver.findElement(By.name("email-or-phone")).sendKeys("princeatish@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sam@123");
		driver.findElement(By.id("join-form-submit")).click();
		driver.findElement(By.name("first-name")).sendKeys("Atish");
		driver.findElement(By.name("last-name")).sendKeys("Sam");
		driver.findElement(By.id("join-form-submit")).click();
		//Thread.sleep(1500);
		//driver.findElement(By.xpath("//*[@id=\"register-verification-phone-number\"]")).sendKeys("7008346957");
		//driver.findElement(By.id("register-phone-submit-button")).click();

}
}

package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Java With Chiru\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("H://Manual Testing/XpathExample.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='field1']")).sendKeys("Atish");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sam");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		//driver.findElement(By.xpath("//input[@type='button']")).click();

	}

}

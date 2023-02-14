package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelClassTest {

	WebDriver driver;
	
	@Test()
	void testCae1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://hdhub4u.boats/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
	}
	
	@Test()
	void testCae2() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://movies4u.skin/");
		driver.manage().window().maximize();
		String el = driver.getTitle();
		System.out.println(el);		
	}
	
}

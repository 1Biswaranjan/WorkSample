package seleniumex;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysForKeyboardAction {

public static void main (String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\\\Java With Chiru\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("princeatsih1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("princeatsih1@gmail.com");
	  //  Keys key = new Keys();
	  //  key.ENTER();
		
	
	
}
}


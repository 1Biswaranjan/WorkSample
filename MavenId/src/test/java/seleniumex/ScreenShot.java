package seleniumex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\\\Java With Chiru\\\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Create New Account")).click();
		
		//full screenshot
		
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg = new File ("H:\\Manual Testing\\screenshot.jpg");
		
		FileUtils.copyFile(src,trg);
		
		
		driver.close();*/
		
		//section of screenshot
		
	/*	WebElement el = driver.findElement(By.xpath("//form[@class='_9vtf']"));
		
          File src=el.getScreenshotAs(OutputType.FILE);
		
		File trg = new File ("H:\\Manual Testing\\screenshot1.jpg");
		
		FileUtils.copyFile(src,trg);
		
		driver.close();*/
		
		//screenshot of element
		
	/*	WebElement el = driver.findElement(By.xpath("//input[@name='email']"));
		
        File src=el.getScreenshotAs(OutputType.FILE);
		
		File trg = new File ("H:\\Manual Testing\\screenshot2.jpg");
		
		FileUtils.copyFile(src,trg);
		
		driver.close();*/
		
		}
}

package pageObjectModel;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("x", "Admin#admin123");
		
		String value=hm.get("x");
		System.out.println(value);
		String arr[]=value.split("#");
		System.out.println(arr[1]);	
		System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    Thread.sleep(1000);	
	    driver.findElement(By.name("username")).sendKeys(arr[0]);
	    driver.findElement(By.name("password")).sendKeys(arr[1]);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	
	
}

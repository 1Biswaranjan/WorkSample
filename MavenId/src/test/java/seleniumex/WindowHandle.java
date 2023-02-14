package seleniumex;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Java With Chiru\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		String title=driver.getTitle();		
		System.out.println(title);
		//String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(1000);
        driver.findElement(By.name("newbrowserwindow123")).click();
        ArrayList<String> window = new ArrayList<String> ();
        window.addAll(driver.getWindowHandles());
        System.out.println(window);
        driver.switchTo().window(window.get(1));
		driver.manage().window().maximize();
		String title1=driver.getTitle();	
		System.out.println(title1);
		Thread.sleep(500);
        driver.switchTo().window(parent);
        driver.quit();

		

		
	}
	
}

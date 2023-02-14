package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Java With Chiru\\\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
	       driver.findElement(By.linkText("Draggable")).click();
	       driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	       Actions mouse = new Actions(driver);
	       Thread.sleep(1000);
	       mouse.dragAndDropBy(driver.findElement(By.id("draggable")), 150, 100).build().perform();
	       
}
}

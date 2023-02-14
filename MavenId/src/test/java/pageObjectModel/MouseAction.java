package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseAction {
	
	public static void main (String[] args) throws InterruptedException
	{
		
		   System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
	       driver.findElement(By.linkText("Draggable")).click();
	       driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	       WebElement element1=driver.findElement(By.id("draggable"));
	       Actions mouse = new Actions(driver);
	       Thread.sleep(1000);
	       mouse.dragAndDropBy(element1, 150, 0).build().perform();
	       driver.switchTo().defaultContent();	     
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
	       WebElement source1 = driver.findElement(By.id("draggable"));
	       WebElement target1 = driver.findElement(By.id("droppable"));
	       mouse.dragAndDrop(source1, target1).build().perform();
	       Thread.sleep(1000);
	       driver.switchTo().defaultContent();	 
	       driver.findElement(By.linkText("Resizable")).click();
	       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
	       WebElement element2 = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	       mouse.clickAndHold(element2).dragAndDropBy(element2, 150, 0).build().perform();
	       



		
	}

}

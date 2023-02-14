package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandle {

	
	public static void main (String[] args) throws InterruptedException
	{
		
		   System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.automationtesting.in/Alerts.html");
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		  /* Actions act = new Actions(driver);
		   WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		   WebElement element2 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
		   act.moveToElement(element1).build().perform();
		   act.moveToElement(element2).click().build().perform();*/
		   driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		  String text= driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  System.out.println(text);
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		  driver.switchTo().alert().accept();
		  String ok=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		  System.out.println(ok);
		  driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		  driver.switchTo().alert().dismiss();
		  String cancel=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		  System.out.println(cancel);
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		  driver.switchTo().alert().sendKeys("Atish");
		  driver.switchTo().alert().accept();
          String text1 = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
          System.out.println(text1);
          driver.close();
}
}

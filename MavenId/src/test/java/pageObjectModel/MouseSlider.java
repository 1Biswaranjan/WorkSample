package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSlider {
	
	public static void main (String[] args) throws InterruptedException
	{
		
		   System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.automationtesting.in/Slider.html");
		   driver.manage().window().maximize();
		   WebElement element1 = driver.findElement(By.xpath("//*[@id=\"slider\"]/a"));
		   Actions mouse = new Actions(driver);
		   mouse.clickAndHold(element1).dragAndDropBy(element1, 150, 0).build().perform();
		   mouse.clickAndHold(element1).dragAndDropBy(element1, -150, 0).build().perform();

}
}

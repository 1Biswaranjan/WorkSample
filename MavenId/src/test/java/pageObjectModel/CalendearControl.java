package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendearControl {
	public static void main(String[] args) throws InterruptedException{

	System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://fs18.formsite.com/71BwPd/ynxtxvlcmr/index.html");
	driver.manage().window().maximize();
    Thread.sleep(1000);	
    driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
    WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
    Select sel = new Select(year);
    sel.selectByVisibleText("1998");
    for(int i =0;i<=10;i++)
    {
    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    	String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    	System.out.println(month);    
    	if(month.equalsIgnoreCase("November"))
    	{
    		driver.findElement(By.xpath("//a[@data-date='28']")).click();
    	}
    }
    
    Thread.sleep(1000);	

   driver.close();
	
}
}

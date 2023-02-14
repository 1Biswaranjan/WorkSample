package pageObjectModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class DropdownSorted {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "H://Manual Testing//My Test Case/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	    Thread.sleep(1000);	
	    WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
	    Select sel = new Select(skill);
	    ArrayList original = new ArrayList();
	    ArrayList  temp = new ArrayList();

	     List<WebElement> options=  sel.getOptions();
	    // System.out.println(options);
	     for(WebElement e:options)
      	{
		original.add(e.getText());
		temp.add(e.getText());
    	}
	     System.out.println(original);
	     System.out.println(temp);

	    Collections.sort(temp);
	   Collections.sort(original);

	    if(original.equals(temp))
	    {
	    	System.out.println("sorted");
	    	
	    }
	    else
	    {
	    	System.out.println("not sorted");

	    }
}
}
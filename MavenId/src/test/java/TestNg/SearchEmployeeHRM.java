package TestNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchEmployeeHRM {

		WebDriver driver ;
	
  	@BeforeMethod()
	void login() throws InterruptedException
	{
  		WebDriverManager.chromedriver().setup();	
  		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);	
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    WebDriverWait wt= new WebDriverWait(driver,20);
	    wt.until(ExpectedConditions.titleContains("OrangeHRM"));
	   // driver.close();
	}
	
	@Test()

	void searchEmployee() throws Exception
	{
    Screen sc = new Screen ();
    Pattern p = new Pattern("H:/Manual Testing/Admin.png");
    Pattern u = new Pattern("H:/Manual Testing/username.png");
    Pattern a = new Pattern("H:/Manual Testing/bs.png");

    sc.click(p);
    sc.type(u,"shilpa123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();  
    Thread.sleep(1000);	
     /*String actualResult=sc.find(a).getText();
     actualResult.trim();
     String expectedResult = "Biswaranjanset";
     SoftAssert st = new SoftAssert();
     st.assertEquals(actualResult, expectedResult);*/
     
	}

	
	@AfterMethod()
	void logout() throws InterruptedException
	{
		   // System.setProperty("webdriver.chrome.driver", "H://Java With Chiru/chromedriver.exe");
		    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		    Thread.sleep(500);
		    driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@Test(enabled=false)
	void addUser() throws FindFailed, InterruptedException, AWTException
	{
		Screen sc = new Screen ();
	    Pattern p = new Pattern("H:/Manual Testing/Admin.png");
	    Pattern p1 = new Pattern("H:/Manual Testing/hu.png");
	    Pattern p3 = new Pattern("H:/Manual Testing/admin2.png");
	    Pattern p4 = new Pattern("H:/Manual Testing/ad.png");
	    Pattern p5 = new Pattern("H:/Manual Testing/status.png");
	    Pattern p6 = new Pattern("H:/Manual Testing/enable.png");
	    Pattern p7 = new Pattern("H:/Manual Testing/username1.png");

	    
	    sc.click(p);
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	    Thread.sleep(1000);
	    sc.click(p1);
	    sc.click(p3);

	    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Alice");
	    Thread.sleep(1500);
	    sc.click(p4);
	    sc.click(p5);
	    Thread.sleep(500);
	    sc.click(p6);
	    sc.type(p7,"Biswaranjanset");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Biswa@123");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Biswa@123");
	    Actions mouse = new Actions(driver);
	     Thread.sleep(1000);
	     mouse.doubleClick(driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"))).build().perform();
	     
	    
	}
	
}

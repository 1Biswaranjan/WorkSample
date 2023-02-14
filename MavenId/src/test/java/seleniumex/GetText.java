package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void main(String[] args) throws InterruptedException, FindFailed {
        
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);	
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    WebDriverWait wt= new WebDriverWait(driver,60);
	    wt.until(ExpectedConditions.titleContains("OrangeHRM"));
	    Screen sc = new Screen ();
	    Pattern p = new Pattern("H:/Manual Testing/Admin.png");
	    Pattern u = new Pattern("H:/Manual Testing/username.png");
	    Pattern a = new Pattern("H:/Manual Testing/bs.png");

	    sc.click(p);
	    sc.type(u,"Thor@143");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();  
	    Thread.sleep(1500);	
	     //String actualResult=sc.find(a).getText();
	    String actualResult = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div/div[2]")).getText();
	     actualResult.trim();
	     System.out.println(actualResult);
	  //   String expectedResult = "Biswaranjanset";
	  //   SoftAssert st = new SoftAssert();
	   //  st.assertEquals(actualResult, expectedResult);
		
	}
	
	
	

}

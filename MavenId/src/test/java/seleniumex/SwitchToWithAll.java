package seleniumex;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SwitchToWithAll {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Java With Chiru\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert al=driver.switchTo().alert();
		String actualResult = al.getText();
		System.out.println(actualResult);
		Thread.sleep(1000);
		al.accept();
		String expectedResult = "Customer ID  cannot be left blank.";
		//SoftAssert st = new SoftAssert();
		//st.assertEquals(actualResult, expectedResult);
		//System.out.println("ok");
		
		Assert.assertEquals(actualResult,expectedResult);
		System.out.println("ok");
		driver.close();		
	}
	
}

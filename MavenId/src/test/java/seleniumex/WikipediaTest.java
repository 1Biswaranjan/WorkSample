package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class WikipediaTest {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Java With Chiru\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.name("search")).sendKeys("India");
		driver.findElement(By.id("searchButton")).click();
		String actualResult=driver.findElement(By.id("firstHeading")).getText();
		System.out.println(actualResult);
		String expectedResult = "India";
		actualResult.trim();
		SoftAssert st = new SoftAssert();
		st.assertEquals(actualResult,expectedResult);
		driver.close();
		

		
		
}
}

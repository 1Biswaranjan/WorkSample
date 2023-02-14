package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class WebTableHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Java With Chiru\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("H://Manual Testing/WebTable.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    String actualResult = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText();
	    System.out.println(actualResult);
	    String expectedResult = "TestNG";
	   // SoftAssert st = new SoftAssert();
	    //st.assertEquals(actualResult, expectedResult);
	    
	    Assert.assertEquals(actualResult, expectedResult);
	    
	   /* int r = driver.findElements(By.xpath("//table/tbody/tr")).size();
	    System.out.println(r);
	    
	    int c=  driver.findElements(By.xpath("//table/tbody/tr[1]/th")).size();
	    System.out.println(c);
	    
	    
	    
	    for(int i = 1;i<=r;i++) {
	    
	    	for(int j = 2; j<=c;j++) {
	    		
	    		System.out.println( driver.findElement(By.xpath("//html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
		    //System.out.println(pt);*/
	
	    	}

	    	

	    
	    
	  //  System.out.println("ok");
	    
		
	}



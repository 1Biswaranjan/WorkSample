package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationIdentification {
	
	WebDriver driver;
	
	 RegistrationIdentification(WebDriver d)
	{
		driver=d;
	}
	 
	 //find all the element for the page
	public void clickCreateNewAccount()
	{
		driver.findElement(By.linkText("Create new account")).click();

	}
   public void firstName(String firstName)
	{
		driver.findElement(By.name("firstname")).sendKeys(firstName);

	}
   public void lastName(String lastname)
	{
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);

	}
   
   public void mailId(String mailId)
  	{
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mailId);

  	}
   
   public void confirmMailId(String confirmMailId)
 	{
	   driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(confirmMailId);

 	}
  
   public void password(String password)
 	{
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);

 	}
   
  /* public void birhDay(String birthDay)
	{
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys(birthDay);

	}
   
   public void birthMonth(String birthMonth)
	{
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(birthMonth);

	}
   public void birthYear(String birthYear)
  	{
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys(birthYear);

  	}*/
   
   public void dropDown(String date , String month , String year) 
   {
	   WebElement dt = driver.findElement(By.xpath("//*[@id=\"day\"]"));
	   WebElement mn = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	   WebElement yr = driver.findElement(By.xpath("//*[@id=\"year\"]"));

		Select sc1 = new Select(dt);
		Select sc2 = new Select(mn);
		Select sc3 = new Select(yr);
		
		sc1.selectByValue(date);
		sc2.selectByValue(month);
		sc3.selectByValue(year);
   }
  
   public void gender()
 	{
		driver.findElement(By.xpath("//input[@value=2]")).click();

 	}
 
   public void submit()
	{
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

   
   }

	


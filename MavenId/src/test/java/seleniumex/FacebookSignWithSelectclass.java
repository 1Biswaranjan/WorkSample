package seleniumex;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignWithSelectclass {

	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\Manual Testing\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Atish");
		driver.findElement(By.name("lastname")).sendKeys("Sam");
		driver.findElement(By.name("reg_email__")).sendKeys("Atish@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Atish@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Atish@123");
		//WebElement day = driver.findElement(By.name("birthday_day"));
		Select day= new Select(driver.findElement(By.name("birthday_day")));
		//day.selectByVisibleText("28");
		day.selectByIndex(27);
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
	//	month.selectByVisibleText("Nov");
		month.selectByIndex(10);

		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
	    year.selectByVisibleText("1998");
		//year.selectByIndex();

		
		//driver.findElement(By.name("birthday_day")).sendKeys("28");
	//	driver.findElement(By.name("birthday_month")).sendKeys("November");
	//	driver.findElement(By.name("birthday_year")).sendKeys("1998");
	//	driver.findElement(By.name("birthday_year")).sendKeys("1998");
	//	driver.findElement(By.xpath("//input[@value=2]")).click();
		//driver.findElement(By.name("websubmit")).click();
}
}
	


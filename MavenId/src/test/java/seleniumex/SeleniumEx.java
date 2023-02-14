package seleniumex;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumEx {
	
	public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.gecko.driver","H:\\Manual Testing\\geckodriver.exe");
		WebDriverManager.chromedriver().setup();
	    WebDriver driver =new ChromeDriver();
	//FirefoxDriver driver=new FirefoxDriver();

	driver.get("https://www.facebook.com/");
	//driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmail.google.com&dsh=S839573877%3A1666621767192177&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&authuser=0");
	driver.manage().window().maximize();
  driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(1500);
	//driver.navigate().to("https://edistrict.odisha.gov.in/#");
	//driver.navigate().back();
	driver.findElement(By.name("firstname")).sendKeys("Sam");
	driver.findElement(By.name("lastname")).sendKeys("linkan");
	driver.findElement(By.name("reg_email__")).sendKeys("sam@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Sam@123");
	driver.findElement(By.name("birthday_day")).sendKeys("28");
	driver.findElement(By.name("birthday_month")).sendKeys("November");
	driver.findElement(By.name("birthday_year")).sendKeys("1998");
	//driver.findElement(By.id("u_2_5_f5")).click();
	//Thread.sleep(500);
	//driver.findElement(By.name("websubmit")).click();
	
	
	//driver.findElement(By.name("q")).sendKeys("hii");

	
	
	
	
	/*driver.findElement(By.name("email")).sendKeys("8018717143");
	driver.findElement(By.name("pass")).sendKeys("gddhgdbh");
	driver.findElement(By.name("login")).click();*/
	
	
	
	

	

	}
}

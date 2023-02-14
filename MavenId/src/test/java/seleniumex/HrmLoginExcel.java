package seleniumex;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HrmLoginExcel {

	public static void main(String[] args) throws Exception {
		
		String fileName = "H://Manual Testing/Book1.xlsx";
		
		FileInputStream input = new FileInputStream(fileName);
		
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		XSSFSheet sheet = book.getSheet("Sheet2"); 
		
		String userName = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(userName);
		
	      String password = sheet.getRow(1).getCell(1).getStringCellValue();
	      
			System.out.println(password);

		System.setProperty("webdriver.chrome.driver", "H://Java With Chiru/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(userName);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    WebDriverWait wt = new WebDriverWait(driver,30);
	    wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='oxd-userdropdown']")));
       driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.linkText("Logout")).click();

	    
		
		
		
		
				
		
	}
	
}

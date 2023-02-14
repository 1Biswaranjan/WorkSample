package TestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliTestNG {

	@Test()
	void faceBookRegistrationn() throws IOException, InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "H:\\\\Java With Chiru\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement ele1 = driver.findElement(By.name("email"));
		File src1 = ele1.getScreenshotAs(OutputType.FILE);
		File f1 = new File("H://Manual Testing/shot1.jpg");
		FileUtils.copyFile(src1, f1);
		
		WebElement ele2 = driver.findElement(By.name("pass"));
		File src2 = ele2.getScreenshotAs(OutputType.FILE);
		File f2 = new File("H://Manual Testing/shot2.jpg");
		FileUtils.copyFile(src2, f2);
		
		WebElement ele3 = driver.findElement(By.name("login"));
		File src3 = ele3.getScreenshotAs(OutputType.FILE);
		File f3 = new File("H://Manual Testing/shot3.jpg");
		FileUtils.copyFile(src3, f3);
		
		Screen sc = new Screen();
		
		Pattern p1 = new Pattern("H://Manual Testing/shot1.jpg");
		Pattern p2 = new Pattern("H://Manual Testing/shot2.jpg");
		Pattern p3 = new Pattern("H://Manual Testing/shot3.jpg");

		Thread.sleep(500);

		sc.type(p1,"Atish");
		sc.type(p2,"Atish");
		sc.click(p3);
		
	//	driver.close();

		
	}
	
	
}

package medibox;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * This script can take screenshot if there is any failure.
 * multiple screenshots with date & Time can be seen in the filepath
 */
public class Login {
	WebDriver driver;
	@Test
	public void openbrowser() throws IOException
	{
		String exePath = "C://Users//Medibox//Downloads//chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.medibox.in/");
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jayasree.n@medibox.in");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8414844",Keys.ENTER);
		 String title = driver.getTitle();
		 System.out.println("Title of the page is " +title);
		 Date d = new Date();
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");  
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  File DestFile=new File("F:\\Bugs Screenshots\\"+sdf.format(d)+".png");
		  FileUtils.copyFile(SrcFile, DestFile);

		 
	}
	
}

package medibox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login {
	WebDriver driver;
 @BeforeClass
	
 public void precondition()
 {
		String exePath = "C://Users//Medibox//Downloads//chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.medibox.in/");
			
 }
 
/* @AfterClass
 
 public void postcondition()
 {
	 driver.close();
 }*/

}

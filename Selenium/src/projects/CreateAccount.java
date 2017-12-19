package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//This script will create a new account. checks with valid and Invalid OTP data.
public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "C://Users//Medibox//Downloads//chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver	", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.medibox.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@title='Sign in / Sign up']")).click();
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("med546@gamil.com");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("84148414");
		driver.findElement(By.xpath("//input[@name='passwordRepeat']")).sendKeys("84148414");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jaya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9742626313");
		driver.findElement(By.xpath("//input[@class='btn btn-medibox']")).click();
		String otppopup = driver.getWindowHandle();
		driver.switchTo().window(otppopup);
		String mobileno = driver.findElement(By.xpath("//b[text()='9742626313']")).getAttribute("textContent");
		System.out.println("The Mobile number inside the popup is "+mobileno);
		Thread.sleep(15000);
		//driver.findElement(By.xpath("(//input[@name='otp'])[2]")).sendKeys("1234");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		Thread.sleep(4000);
	//String error = driver.findElement(By.xpath("//p[text()='Enter valid OTP']")).getAttribute("textContent");
	//System.out.println("Error message is "+error);
	 //driver.findElement(By.xpath("(//button[@class='close'])[2]")).click();
		driver.quit();
		
		
		
	
	}
}

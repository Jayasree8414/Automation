package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Login to medibox from signIn/sign up page
public class Firstclass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String exePath = "C://Users//Medibox//Downloads//chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver	", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.medibox.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@title='Sign in / Sign up']")).click();
		driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys("jayasree.n@medibox.in");
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("84148414");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='btn-success large']")).click();
		
	}

}

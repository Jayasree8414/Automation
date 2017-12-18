package medibox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Placing order from pharmacy to stockist(product search)
public class Firstscript {

	public static void main(String[] args) throws InterruptedException {
		
		
		String exePath = "C://Users//Medibox//Downloads//chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.medibox.in/");
		Thread.sleep(2000);
		String  username = "jayasree.n@medibox.in";
		WebElement a = driver.findElement(By.xpath("//input[@name='username']"));
		a.sendKeys(username);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("84148414",Keys.ENTER);
		Thread.sleep(7000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(@class, 'dropdown-toggle ng-binding')]"));
		ele.click();
		driver.findElement(By.xpath("//a[@href='/myBusiness']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ng-binding'])[15]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle text-color mouseover-nav'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Product Search']")).click();
		//Select location= new Select(driver.findElement(By.id("locationId")));
		//location.selectByVisibleText("BANGALORE");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle ng-binding']")).click();
		//driver.findElement(By.xpath("(//a[@class='ng-binding'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='firstGridView']")).sendKeys("5");
		driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='btn link-custom']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	String order = driver.findElement(By.xpath("//p[@class='text-success ng-binding']")).getText();
	System.out.println(order);
	System.out.println("pass");
		
		
	}

}

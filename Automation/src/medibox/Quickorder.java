package medibox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//placing order by using Quick order.
public class Quickorder {

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
		driver.findElement(By.xpath("//a[text()='Quick Order']")).click();
		Select location= new Select(driver.findElement(By.name("loc-group")));
		Thread.sleep(3000);
		location.selectByValue("2");
		Select stockist=new Select(driver.findElement(By.id("dropdown")));
		Thread.sleep(3000);
		stockist.selectByValue("11");
		//Thread.sleep(3000);
		//String stockistAdress = driver.findElement(By.className("ng-binding ng-scope")).getText();
		//System.out.println(stockistAdress);
		driver.findElement(By.id("searchInput")).sendKeys("ACECLO MR TABLET  10's (10 s)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='row'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='quantityInput']")).sendKeys("10");
		WebElement Addtocart = driver.findElement(By.xpath("//button[@class='btn btn-sm']"));
		if(Addtocart.isEnabled())
		{
			Addtocart.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	}

}

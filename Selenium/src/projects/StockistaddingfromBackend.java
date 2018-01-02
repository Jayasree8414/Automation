package projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StockistaddingfromBackend {
	public static WebDriver driver;
	@Test(priority=0)
	public void browser(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Medibox/Documents/My softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Users//Medibox//Downloads//chromeDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		driver=new ChromeDriver(capabilities);
		driver.get("https://demo.medibox.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jayasree.n@medibox.in");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("84148414");
		driver.findElement(By.xpath("//*[@id='fixedlogin']/form/div[3]/p/button"));
		
	}
	@Test(priority=1)
	public void stockistadding(){
		
		try{
			WebElement ele;
			WebDriverWait wait = new WebDriverWait(driver, 100);
			ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarMenu']/div/div[2]/ul/li[5]/a")));
			ele.click();
					
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//*[@id='navbarMenu']/div/div[2]/ul/li[5]/ul/li[2]/a"));
		WebElement Business = driver.findElement(By.xpath("//*[@id='admin']/div/div[1]/div/ul/li[4]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(Business);
		driver.findElement(By.xpath("//*[@id='admin']/div/div[1]/div/ul/li[4]/ul/li[3]/a"));
		AddStockist AddStockist = new AddStockist(driver);
		AddStockist.addingstockist("abcde stockist", "9742626313", "9742626313", "KARNATAKA", "BANGALORE","560004");
		AddStockist.states();
		AddStockist.cities();
		AddStockist.add();
		
		
	}
}

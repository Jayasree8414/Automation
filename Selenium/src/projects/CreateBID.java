package projects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateBID {
	public WebDriver driver;
	@Test
	public void creatingabid()throws Exception{
		System.setProperty("webdriver.chrome.driver","C://Users//Medibox//Downloads//chromeDriver.exe");
		System.setProperty("webdriver.gecko.driver","C:/Users/Medibox/Documents/My softwares/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.medibox.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("jayasree.n@medibox.in");
	    
	    driver.findElement(By.name("password")).sendKeys("84148414",Keys.ENTER);
	    
	    Thread.sleep(2000);
	    try
	    {
	    driver.findElement(By.cssSelector("#navbarMenu > div > div.collapse.navbar-collapse.login > ul > li.loginDropDown.ng-scope > a")).click();
	    driver.findElement(By.cssSelector("#navbarMenu > div > div.collapse.navbar-collapse.login > ul > li.loginDropDown.ng-scope.open > ul > li:nth-child(6) > a")).click();
	    driver.findElement(By.xpath("//*[@id='main']/section/div/div/div/div/div[2]/form/div[6]/table/tbody/tr[8]/td[2]/a")).click();
	   CreateBidPOM createbid = new CreateBidPOM(driver);
	   createbid.Product();
	   createbid.BidANDask();
	   createbid.CreateBid();
	   createbid.creatingbid("Dolo 650mg tablet", "Abbott", "15's", "10", "300", "dolooo", "1500", "this is description", "no termss", "bangalore");
	   createbid.ProductType();
	   createbid.Form();
	   createbid.Type();
	   createbid.Expirydate();
	   createbid.BidEndDate();
       createbid.Submit();
	}catch(Exception e){}}

}

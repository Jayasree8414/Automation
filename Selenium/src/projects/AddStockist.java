package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddStockist {

	public  WebDriver driver;

	public AddStockist(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement name(){
	
	return driver.findElement(By.xpath("//*[@id='nameId']") );
		}
	public WebElement claimNumber() {
		return driver.findElement(By.xpath("//*[@id='claimNumberId']"));
	}
	public WebElement mobileNumber() {
		return driver.findElement(By.xpath("//*[@id='contactNumberId']"));
	}
	public WebElement state() {
		return driver.findElement(By.xpath("//*[@id='stateId']"));
	}
	public WebElement selectstate() {
		return driver.findElement(By.xpath("//*[@id='addDist']/div/section/div[2]/div[4]/div/div/div[2]/div[3]/div"));
	}
	public WebElement city() {
		return driver.findElement(By.xpath("//*[@id='townId']"));
	}
	public WebElement selectcity() {
		return driver.findElement(By.xpath("//*[@id='scrollable-dropdown-menu']/ul/li/a"));
	}
	public WebElement postalcode() {
		return driver.findElement(By.xpath("//*[@id='postCodeId']"));
	}
	public WebElement clickheretoadd() {
		return driver.findElement(By.xpath("//*[@id='addDist']/div/section/div[2]/div[5]/div/div/button"));
	}
	public void addingstockist(String Name,String claimNumber,String MobileNumber, String State,String City,String Postalcode ){
		this.name().sendKeys(Name);
		this.claimNumber().sendKeys(claimNumber);
		this.mobileNumber().sendKeys(MobileNumber);
		this.state().sendKeys(State);
		this.city().sendKeys(City);
		this.postalcode().sendKeys(Postalcode);
	}
	public void states()
	{
		this.selectstate().click();
	}
	public void cities()
	{
		this.selectcity().click();
	}
	public void add(){
		WebElement clickheretoadd = this.clickheretoadd();
		if(clickheretoadd.isEnabled())
		{
			clickheretoadd.click();
		}else{
			System.out.println("ClickHereToAdd button is not enabled");
		}
	}
}

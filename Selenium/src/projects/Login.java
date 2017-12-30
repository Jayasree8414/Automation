package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login
{
	public Login(WebDriver driver){
		this.driver=driver;
	}
	public WebDriver driver;
	@Test
	public WebElement UserName()
	{
	    return driver.findElement(By.xpath("//input[@name='username']"));
	}
	public WebElement PassWord(){
	    return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public WebElement  l(){
		return driver.findElement(By.xpath("(//button[text()='LOGIN'])[1]"));
	}
	
	public void params(String username, String password){
		this.UserName().sendKeys(username);
		this.PassWord().sendKeys(password);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		this.l().click();
		
	}
	}



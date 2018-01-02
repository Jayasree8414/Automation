package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * This is the POM class for login page.
 */
public class Login
{
	public Login(WebDriver driver){
		this.driver=driver;
	}
	public WebDriver driver;
	
	public WebElement UserName()
	{
	   return  driver.findElement(By.xpath("//input[@name='username']"));
	     
	}
	public WebElement PassWord(){
	    return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public WebElement  submit(){
		return  driver.findElement(By.xpath("//*[@id='fixedlogin']/form/div[3]/p/button"));
	}
	
	public void params(String username){
		this.UserName().sendKeys(username);
	}
	public void params1(String password){
			
	this.PassWord().sendKeys(password);
		  
	}
	public void loginbutton(){
		this.submit().click();
	}
		
		
	
	}



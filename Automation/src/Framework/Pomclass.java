package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
	@FindBy(xpath="//input[@name='username']") 
	private WebElement username;
	@FindBy(xpath="//input[@name='password']") 
	private WebElement password;
	@FindBy(xpath="(//button[.='LOGIN'])[1]") 
	private WebElement loginbtn;
	
public Pomclass(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void login(String un,String pw)
{
username.sendKeys(un);
password.sendKeys(pw);
loginbtn.click();

}
}

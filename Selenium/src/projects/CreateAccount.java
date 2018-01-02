package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*This script will create a new account. 
 * checks with valid and Invalid OTP data.
 * Logout after successful registration
 */
public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "C://Users//Medibox//Downloads//chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver	", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.medibox.in/");
		driver.manage().window().maximize();
	    /*driver.findElement(By.xpath("//span[@title='Sign in / Sign up']")).click();
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("redpink61@yahoo.com");
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
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	    //String error = driver.findElement(By.xpath("//p[text()='Enter valid OTP']")).getAttribute("textContent");
	   //System.out.println("Error message is "+error);
	   //WebDriverWait wait = new WebDriverWait(driver,20);
			try{Thread.sleep(6000);}
			catch(Exception e){}
			WebElement Link = driver.findElement(By.xpath(".//*[@id='navbarMenu']/div/div[2]/ul/li[5]/a"));
		 Link.click();
		 Thread.sleep(6000);
	     WebElement logout=driver.findElement(By.xpath("//*[@id='navbarMenu']/div/div[2]/ul/li[5]/ul/li[6]/a"));
	     logout.click();
		*/
		 //Login Log = new Login(driver);
		 Thread.sleep(5000);
		//Log.params("jayasree.n@medibox.in", "84148414");
		// System.out.println("user logged in successfully");
		
		//driver.close();
	
	}
}

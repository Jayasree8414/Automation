package projects;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Deals {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDeals() throws Exception {
    driver.get("https://demo.medibox.in/");
    driver.findElement(By.name("username")).sendKeys("jayasree.n@medibox.in");
    driver.findElement(By.name("password")).sendKeys("84148414");
    Thread.sleep(6000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Jaya")).click();
    driver.findElement(By.linkText("My Business")).click();
    driver.findElement(By.linkText("TESTING DIST")).click();
    Thread.sleep(5000);
   WebElement promotions = driver.findElement(By.xpath("(//a[@class='text-color mouseover-nav'])[5]"));
    Actions action = new Actions(driver);
    action.moveToElement(promotions).perform();
                   
    driver.findElement(By.linkText("Deals")).click();
    driver.findElement(By.xpath("//div[@id='distributor']/div[2]/div[2]/section/div/div/div/div/div[2]/div/button")).click();
    driver.findElement(By.id("searchInput")).click();
    driver.findElement(By.id("searchInput")).clear();
    driver.findElement(By.id("searchInput")).sendKeys("a");
    driver.findElement(By.xpath("//div[@id='scrollable-dropdown-menu']/ul/li/a/div/div[2]")).click();
    driver.findElement(By.xpath("//textarea[@type='text']")).click();
    driver.findElement(By.xpath("//textarea[@type='text']")).clear();
    driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("10+5");
    driver.findElement(By.xpath("(//textarea[@type='text'])[2]")).click();
    driver.findElement(By.xpath("(//textarea[@type='text'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@type='text'])[2]")).sendKeys("no terms");
    driver.findElement(By.xpath("//div[@id='distributor']/div[2]/div[2]/section/div/div/div/div/div[2]/div[3]/div/form/div[2]/div[3]/div/input")).click();
    driver.findElement(By.xpath("//div[34]")).click();
    driver.findElement(By.xpath("//div[@id='distributor']/div[2]/div[2]/section/div/div/div/div/div[2]/div[3]/div/form/div[2]/div[4]/div/input")).click();
    driver.findElement(By.xpath("//div[34]")).click();
    driver.findElement(By.xpath("(//input[@name='optradio'])[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bangalore");
   Thread.sleep(9000);
    driver.findElement(By.linkText("bangalore")).click();
     boolean Createdeal = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
    
    if(Createdeal==true){
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    else{
    	System.out.println("Create Deal button is disabled.");
    }
    try {
        assertTrue(isElementPresent(By.xpath("//div[@id='distributor']/div[2]/div[2]/section/div/div/div/div/div[2]/div/button")));
      } catch (Error e) {
        verificationErrors.append(e.toString());
        System.out.println("After creating the deal it is not navigating to Deals page");
      }
  }

 /* @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }*/

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

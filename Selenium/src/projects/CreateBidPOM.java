package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateBidPOM {
	public  WebDriver driver;

	public CreateBidPOM(WebDriver driver){
		this.driver=driver;
	}
	public WebElement Products(){
		
		return driver.findElement(By.xpath("//*[@id='navtop']/div/div[2]/ul[1]/li[2]/a") );
			}
    public WebElement bidandask(){
		
		return driver.findElement(By.xpath("//*[@id='navtop']/div/div[2]/ul[1]/li[2]/ul/li[3]/a") );
			}
    public WebElement createbid(){
		
		return driver.findElement(By.xpath("//*[@id='distributor']/div[2]/div[2]/div/div/div/div/div/div/div[1]/button") );
			}
    public WebElement productname(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[1]/input") );
			}
   public WebElement producttype(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[2]/select") );
			}
   public WebElement producttypedropdown(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[2]/select") );
			}
   public WebElement company(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[3]/input") );
			}
   public WebElement form(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[4]/select") );
			}
   public WebElement type(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[5]/select") );
			}
   public WebElement packsize(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[6]/input") );
			}
   public WebElement expirydate(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[7]/input") );
			}
   public WebElement expirydatepicker(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[7]/ul/li[1]/table/tbody/tr[3]/td[8]/button/span") );
			}
   public WebElement quantity(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[8]/input"));
			}
   public WebElement baseprice(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[2]/form/div[9]/input"));
			}
   public WebElement composition(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[1]/input"));
			}
   public WebElement buynowprice(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[2]/input"));
			}
   
   public WebElement description (){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[3]/textarea"));
			}

   public WebElement termsandconditions(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[4]/textarea"));
			}
   public WebElement bidenddate(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[5]/input"));
			}
   public WebElement bidenddatepicker(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[5]/ul/li[1]/table/tbody/tr[2]/td[5]/button"));
			}
   public WebElement location(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/form/div[6]/input"));
			}
   public WebElement submit(){
		
		return driver.findElement(By.xpath("//*[@id='bidCreate']/div[2]/div/div[2]/div/div/div[3]/div/button[1]"));
			}
   public void Product(){
	   this.Products().click();
	   
   }
   public void BidANDask(){
	   this.bidandask().click();
   }
   public void CreateBid(){
	   this.createbid().click();
   }
   public void creatingbid(String ProductNAme,String Company,String PackSize,String Quantity,String BasePrice,String Composition,String BuyNOWPrice,String Description,String TermsANDconditions,String Location){
	  this.productname().sendKeys(ProductNAme);
	  this.company().sendKeys(Company);
	  this.packsize().sendKeys(PackSize);
	  this.quantity().sendKeys(Quantity);
	  this.baseprice().sendKeys(BasePrice);
	  this.composition().sendKeys(Composition);
	  this.buynowprice().sendKeys(BuyNOWPrice);
	  this.description().sendKeys(Description);
	  this.termsandconditions().sendKeys(TermsANDconditions);
	  this.location().sendKeys(Location);
   }
public void ProductType(){
	this.producttype().click();
		Select select=new Select(producttype());
		select.selectByValue("BRAND");
	
}
public void Form(){
	this.form().click();
	Select select=new Select(form());
	select.selectByValue("ABC");
	}
public void Type(){
	this.type().click();
	Select select=new Select(type());
	select.selectByValue("ABC");
		
}
public void Expirydate(){
	this.expirydate().click();
	this.expirydatepicker().click();
}
public void BidEndDate()
{
	this.bidenddate().click();
	this.bidenddatepicker().click();
}
public void Submit(){
	this.submit().click();
}
}

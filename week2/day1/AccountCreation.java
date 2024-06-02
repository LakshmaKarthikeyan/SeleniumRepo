package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver =new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
	
		//load url
		driver.get("http://leaftaps.com/opentaps/.");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Srinithi");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select ind=new Select(industry);
		ind.selectByValue("IND_SOFTWARE");
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select owner=new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.id("dataSourceId"));
	    Select sourcedp=new Select(source);
	    sourcedp.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement marketingcampaign=driver.findElement(By.id("marketingCampaignId"));
	    Select mc=new Select(marketingcampaign);
	    mc.selectByIndex(6);
	    
	    WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select sp=new Select(state);
	    sp.selectByValue("TX");
	    
	    
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify the screen
		String title=driver.getTitle();
		
	    Thread.sleep(3000);
		
		if(title.contains("Account Details |"))
		{
			System.out.println("Account Details page verified");
		}
		else
		{
			System.out.println("Account Details page not verified");
		}
		
		//close the browser
		
		driver.close();
	}

}

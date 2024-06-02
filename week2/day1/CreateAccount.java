package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		driver.findElement(By.id("accountName")).sendKeys("Lakshma");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("50");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
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
		
		//close
	
		driver.close();
		
	}

}

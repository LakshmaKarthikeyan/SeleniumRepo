package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {



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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthikeyan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SapphireIMS");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Engineer");
		driver.findElement(By.name("submitButton")).click();
		
		String title= driver.getTitle();
		
		Thread.sleep(3000);
		
		if(title.contains("View Lead"))
		{
		  System.out.println("Lead creation success");
		}else
		{
			  System.out.println("Lead creation failed");
			
		}
		
		driver.close();
		

	}

}

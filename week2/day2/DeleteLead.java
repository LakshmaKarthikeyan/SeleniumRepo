package week2.day2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String leadid="";
		ChromeDriver driver=new ChromeDriver();
		
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8220");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		try {
		leadid = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("Leadid="+leadid);
		
		}catch(Exception e)
		{
			
			System.out.println("No Lead available with the given phone number");
		}
		if(leadid!="")
		{
			driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();	
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(3000);
			try
			{
			
				driver.findElement(By.xpath("//div[text()='No records to display']"));
				System.out.println("Lead deleted Successfully");
				
				
			}catch(Exception e)
			{
				
				System.out.println("Lead not deleted");
			}
		}
		driver.close();
		

	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLoginXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		
		
		String title = driver.getTitle();
		Thread.sleep(3000);
	    if(title.contains("Forgotten")) 
		  {
		  System.out.println(" Page verified");
		  }
		  else 
		  {
			  System.out.println(" Page Not verified");  
		  }
	    driver.close();
		
	}

}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your")).click();
	    String title = driver.getTitle();
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


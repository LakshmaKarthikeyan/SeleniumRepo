package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize ChromeDriver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Maximize the browser window 
		
		driver.manage().window().maximize();
		
		//Switch to the frame
		
		driver.switchTo().frame("iframeResult");
		
		//Add an implicit wait to ensure the webpage elements are fully loaded

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//- Click the "Try It" button inside the frame
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Switch to alert
		
		Alert alert=driver.switchTo().alert();
		
		//send value to the alert
		alert.sendKeys("Lakshma");
		
		//accept the alert
		alert.accept();
		
		//Check whether alert accepred or not
		
		String text=driver.findElement(By.id("demo")).getText();
		
		if(text.contains("How are you"))
		{
			System.out.println("Alert Accepted");
		}else
		{
			System.out.println("Alert Dismissed");
		}
		
		//close the webpage
		driver.close();
		
		
	}

}

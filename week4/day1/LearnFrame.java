package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize Chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		
		//Implicit wait added
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//switch to alert
		
		Alert alert=driver.switchTo().alert();
		
		//accept the alert
		alert.dismiss();
		
		String message=driver.findElement(By.id("demo")).getText();
		
		if(message.contains("OK"))
		{
			System.out.println("Alert Accepted");
		}else {
			System.out.println("Alert denied");
		}
		
		driver.close();
	}

}

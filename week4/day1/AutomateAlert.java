package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Lakshma");
		alert.dismiss();
		String text=driver.findElement(By.id("confirm_result")).getText();
		if(text.equals("Lakshma"))
		{
			System.out.println("Alert acepted");
			
			}else
			{
				System.out.println("Alert Dismissed");
			}
		driver.close();
		}
	

}

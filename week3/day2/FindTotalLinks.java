package week3.day2;

import java.util.Iterator;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int totalLinks=link.size();
		System.out.println(totalLinks);
		
		for (int i = 0; i < totalLinks; i++) {
			
			String linkName=link.get(i).getText();
			System.out.println(linkName);
			
			
		}
		
		driver.close();
			
		}
		
		
		
	}



package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		//load url
	    driver.get("https://en-gb.facebook.com/");
		
		//maximize window
	    driver.manage().window().maximize();
	    
	    //selenium wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.findElement(By.linkText("Create new account")).click();
	    
	    driver.findElement(By.name("firstname")).sendKeys("Sri");
	    driver.findElement(By.name("lastname")).sendKeys("Sri");
	    driver.findElement(By.name("reg_email__")).sendKeys("lakshma@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("lakshma@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Srinithi");
	    
	    WebElement bday=driver.findElement(By.name("birthday_day"));
	    Select bd=new Select(bday);
	    bd.selectByValue("21");
	    
	    WebElement bmth=driver.findElement(By.name("birthday_month"));
	    Select bm=new Select(bmth);
	    bm.selectByValue("7");
	    
	    WebElement byr=driver.findElement(By.name("birthday_year"));
	    Select by=new Select(byr);
	    by.selectByValue("1995");
	    
	    
	    driver.findElement(By.xpath("//label [text()='Female']")).click();
	    
	    //close the browser
	    driver.close();
	    
	    
	}

}

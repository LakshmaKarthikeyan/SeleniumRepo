package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		//Open the url
		
	    driver.get("https://www.facebook.com/");
		
		
		//maximize the screen
		
		driver.manage().window().maximize();
		
		
		//close the browser
		
		driver.close();

	}

}

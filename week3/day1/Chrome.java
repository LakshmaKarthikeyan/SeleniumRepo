package week3.day1;

public class Chrome extends Browser{

	public void openIncognito() 
	{
		System.out.println("openIncognito from Chrome-Parent");
	}
	public void clearCache() 
	{
		System.out.println("clearCache from Chrome-Parent");
	}
	
	public static void main(String[] args) {
	
	Chrome co=new Chrome();
	
	co.openIncognito();
	co.clearCache();
	co.openURL();
	co.closeBrowser();
	co.navigateBack();
	co.browserName="Chrome";
	co.browserVersion="125.0.6422.141/142";
	System.out.println("BrowserName="+co.browserName);
	System.out.println("BrowserVersion="+co.browserVersion);
	}
	
}



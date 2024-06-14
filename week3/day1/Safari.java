package week3.day1;

public class Safari extends Browser{

	public void readerMode() 
	{
		System.out.println("readerMode from Safari-Parent");
	}
	
	public void fullScreenMode() 
	{
		System.out.println("fullScreenMode from Safari-Parent");
	}
	
	public static void main(String[] args) {
		
		Safari so=new Safari();
		so.readerMode();
		so.fullScreenMode();
		so.openURL();
		so.closeBrowser();
		so.navigateBack();
		so.browserName="Safari";
		so.browserVersion="14.1";
		System.out.println("BrowserName="+so.browserName);
		System.out.println("BrowserVersion="+so.browserVersion);
	
	}
}

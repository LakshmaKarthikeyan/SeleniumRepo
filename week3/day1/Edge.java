package week3.day1;

public class Edge extends Browser {

	public void takeSnap() 
	{
		System.out.println("takeSnap from Edge-Parent");
	}
	
	public void clearCookies() 
	{
		System.out.println("clearCookies from Edge-Parent");
	}
	
	public static void main(String[] args) {
	
		Edge eo=new Edge();
		eo.takeSnap();
		eo.clearCookies();
		eo.openURL();
		eo.closeBrowser();
		eo.navigateBack();
		eo.browserName="Edge";
		eo.browserVersion="26.0.2592.36";
		System.out.println("BrowserName="+eo.browserName);
		System.out.println("BrowserVersion="+eo.browserVersion);
	
	}
}

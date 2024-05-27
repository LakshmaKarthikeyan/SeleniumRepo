package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser callfromedge=new Browser();
		String launchBrowser=callfromedge.launchBrowser("Browser landed Successfully");
		System.out.println(launchBrowser);
		callfromedge.loadUrl();
	}

}

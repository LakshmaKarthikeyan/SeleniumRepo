package week3.day1;

public class LoginVerification extends LoginTestData{

	//enterUsername method created in the Child class
	public void isHomeScreenProper() 
	
	{
		System.out.println("Homescreen is proper");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object to call the methods
		LoginVerification lv=new LoginVerification();
		

        //Calling method of the parent class
		lv.enterUsername();
		
		//Calling method of the parent class
		lv.enterPassword();
		
		//Calling method of the grand parent class
		lv.navigateToHomePage();
		
		//Calling method of the same class
		lv.isHomeScreenProper();
	}
	

}

package week3.day1;

public class LoginTestData extends TestData{

	//enterUsername method created in the Parentclass
	public void enterUsername() {
		System.out.println("Username Entered");
	}
	
	
	//enterPassword method created in the Parentclass
	public void enterPassword() {
		System.out.println("Password Entered");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object to call the methods
		LoginTestData ltd=new LoginTestData();
		
		//Calling method of the same class
		ltd.enterUsername();
		
		//Calling method of the same class
		ltd.enterPassword();
		
		//Calling method from its parent class (Which is G.P)
		ltd.navigateToHomePage();
	}

}

package week1.day2;

public class Palindrome2 {

	public static void main(String[] args) {
		//Declare variable to store input 
		int input=12121;
		// Temporary Variable to store the input
		int temp=input;
		//Variable to store the reversed input
		int rev=0;
		//Variable to store the reminder
		int storeReminder;
		//Variable to store the quotient
		int storeQuo;
		
		//Loop to obtain the reversed value
		while(temp>0)
		{
			storeQuo=temp/10;
			storeReminder=temp%10;
			temp=storeQuo;
		    rev=rev*10+storeReminder;	
		}
		
		
		if(input==rev)
		{
			System.out.println(input+" is palindrome");
		}else
		{
			System.out.println(input+" not a palindrome");
		}
		
		
	}

}

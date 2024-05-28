package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="12121";
		String rev="";
		for(int i=input.length()-1 ; i>=0; i--)
		{
			rev=rev+input.charAt(i);
		}
		
		if(input.equals(rev))
		{
			System.out.println(input+" is palindrome");
		}else 
		{
			System.out.println(input+" is not palindrome");
		}
	}

}

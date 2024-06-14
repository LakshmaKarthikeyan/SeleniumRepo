package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reverseString="Lakshma";
		
		char strarray[]=reverseString.toCharArray();
		System.out.println(reverseString);
		for(int i=strarray.length-1 ;i>=0;i--)
		{
			System.out.print(strarray[i]);
		}
		
	}

}

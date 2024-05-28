package week1.day2;

import java.util.Arrays;

public class FindMissingElement2 {

	public static void main(String[] args) {
		
		int missing[]={1,4,3,2,8,6,7};
		Arrays.sort(missing);
		int max=missing[missing.length-1];
		int sum=0;
		for(int i=0; i<missing.length; i++)
		{
			sum=sum+missing[i];
			
		}
		
	    int missingNumber=(max*(max+1)/2)-sum;
		System.out.println("Missing Number is "+missingNumber);
	}

}

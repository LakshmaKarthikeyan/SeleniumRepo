package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int missing[]={1,4,3,2,8,6,7};
		
		Arrays.sort(missing);
		
		for(int i=missing[0] ;i<missing[missing.length-1];i++)
		{
		
		if(i!=missing[i-1])
		{
			System.out.println(i);
			break;
		
		}
	}

}

}

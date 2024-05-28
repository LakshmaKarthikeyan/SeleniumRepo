package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
	

		//Declaration of array one
		int a[]={3,2,11,4,6,7}; 
		
		//Declaration of array two
		int b[]={1,2,8,4,9,7}; 
		
		//Sort array one and two so that we can reduce the iteration of the loop during comparison
		Arrays.sort(a);
		Arrays.sort(b);
		//Loop for iteration Array one
		
		for (int i=0; i<=a.length-1; i++)
		{
			//Loop for iteration Array 2
			 for(int j=0; j<=b.length-1; j++)
			{
				//if the data of array one and two are equal print as intersection
				
				if(a[i]==b[j])
				{
				System.out.println(a[i]+ " is intersecting");
				// break reduces further comparison
				break;
				}
				
			
			}
		}
		
	}

}

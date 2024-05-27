package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxIteration=15;
		boolean isPrime;
		
		for(int i=2 ; i< maxIteration;i++)
		{
			 isPrime=true;
			
			for (int j=2; j<i ;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			
			if(isPrime==true)
			{
				System.out.println(i +" is a Prime Number");
			}else
			{
				System.out.println(i +" not a Prime Number");
			}
			
		}
		
	}

}

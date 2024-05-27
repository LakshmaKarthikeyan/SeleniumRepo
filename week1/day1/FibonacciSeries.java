package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int maxIteration=8;
		int number1=0;
		int number2=1;
		int sum=0;
		
		System.out.println("FibonacciSeries are "+"\n"+number1+"\n"+number2);
		for (int i=1; i<=maxIteration; i++)
		{
			sum=(number1+number2);
			number1=number2;
			number2=sum;
			System.out.println(sum);
		}
		
	}

}

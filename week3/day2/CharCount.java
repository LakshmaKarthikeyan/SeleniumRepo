package week3.day2;



public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Lakshma";
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			
			if(name.charAt(i)=='a')
			{
				count++;
			}
			
			
			
		}
		System.out.println("Number of occurences of a ="+count);
	
	}

}

package week3.day1;

public class LearnOverride extends LearnOverload{

	
	public void reportStep() 
	
	{
		System.out.println("Overridden");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LearnOverride or=new LearnOverride();
		LearnOverload ol=new LearnOverload();
		or.reportStep();
		ol.reportStep();
		
	}

}

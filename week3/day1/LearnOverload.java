package week3.day1;

public class LearnOverload {

	
	public void reportStep() 
	{
		System.out.println("check method");
		
	}
	
	public void reportStep(String msg, String Status) 
	{
		System.out.println("Message="+msg+" Status="+Status);
	}
	
	public void reportStep(String msg, String Status,boolean snap) 
	{
		System.out.println("Message="+msg+",Status="+Status+",Snap="+snap);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnOverload ol=new LearnOverload();
		ol.reportStep();
		ol.reportStep("record all steps","Passed",true);
		ol.reportStep("record few steps", "Failed");
	}

}

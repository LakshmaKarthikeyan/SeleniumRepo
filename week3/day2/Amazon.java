package week3.day2;

public class Amazon extends CanaraBank {

	public void upiPayments() {
		System.out.println("Paid By UPI");
		
	}

	public void cardPayments() {
		System.out.println("Paid by Card");
		
	}

	public void internetBanking() {
		System.out.println("Paid by internet Banking");
		
	}


	public void recordPaymentDetails() {
		System.out.println("Recorded");
		
	}
	
	public static void main(String args[])
	{
		Amazon am=new Amazon();
		am.upiPayments();
		am.cardPayments();
		am.internetBanking();
		am.cashOnDelivery();
		am.recordPaymentDetails();
	}
	

}

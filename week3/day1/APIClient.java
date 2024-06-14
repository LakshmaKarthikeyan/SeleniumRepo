package week3.day1;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Endpoint="+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Endpoint="+endpoint+ "RequestBody="+requestBody+"RequestStatus="+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		APIClient api=new APIClient();
		
		//call the single input method
		
		api.sendRequest("Endpoint data sent");
		
		//call the triple input method
		
		api.sendRequest("End point data sent", "request sent", true);
		
	}

}

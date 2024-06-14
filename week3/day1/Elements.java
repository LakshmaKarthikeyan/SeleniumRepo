package week3.day1;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elements ele=new Elements();
		
		//call the method of parent class Button 
		ele.submit();
		//Call the method of grandparent class Webelement
		ele.click();
		//Call the method of grandparent class Webelement
		ele.setText("Set the text into base class");
		
	}

}

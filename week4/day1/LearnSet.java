package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="Lakshma";
		char[] name=value.toCharArray();
		String output="";
		
		Set<Character> nameset=new LinkedHashSet<Character>();
		
		for (Character removeDup : name) {
			nameset.add(removeDup);
			
		}
		
		for (Character convertString : nameset) {
			output+=convertString;
			
		}
		System.out.println(output);
	} 

}

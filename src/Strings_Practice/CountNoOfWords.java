package Strings_Practice;

import java.util.Arrays;

public class CountNoOfWords {

	public static void main(String[] args) {
		String s = "This is your first java program";
		
		System.out.println(s.length());
		
		String[] s3 = s.split(" ");
		for (String i :s3)
		{
			System.out.println(i);
		}
			System.out.println("Number of words available :" + s3.length);
			
		
			
	}
}
			
			
			

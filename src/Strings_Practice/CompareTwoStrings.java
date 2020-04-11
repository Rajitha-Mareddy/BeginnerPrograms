package Strings_Practice;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String s1 = "This is Exercise 1";
		String s2 = "This is Exercise 2";
		String s5 = "this is Exercise 2";
		int s3 =s1.compareTo(s2); // compareTo() method to compare Strings in alphabetical order
		System.out.println(s3);
		if (s3== -1)
	{
		System.out.println(s1 + " is less than " +s2);
	}
		
		int s4= s1.compareToIgnoreCase(s5); //compareToIgnoreCase() method ignores the upper and lower case and compares Strings in alphabetical order
		System.out.println(s4);
		if (s4== -1)
		{
			System.out.println(s1 + " is less than " +s5);
		
	}
	
		

	}

}

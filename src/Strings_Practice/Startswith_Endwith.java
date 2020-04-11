package Strings_Practice;

public class Startswith_Endwith {

	public static void main(String[] args)
	{
		// endsWith() method
		System.out.println("endsWith() method");
		
		String s1 = "PHP Exercises and Python Exercises";

		boolean s4 = s1.endsWith("se"); // if the string ends with give word it returns true else false
		System.out.println(s4);

		boolean s5 = s1.endsWith("ses");
		System.out.println(s5);

		// startsWith() method
		
		System.out.println("startsWith() method");
		
		String s3 = "Red is favorite color.";
		String s6 = "Orange is also my favorite color.";
		
		boolean t = s3.startsWith("Red"); // if the string starts with given word it returns true else false
		System.out.println(s3 + "starts with Red ?  " + t);
		boolean u = s6.startsWith("Red");
		System.out.println(s6 + "starts with Red ?  " + u);
		
		//Substring() method

		System.out.println("substring() method");
		String w = "The quick brown fox jumps over the lazy dog.";
		String y =w.substring(10, 24);
		System.out.println(y);

	}

}

package Strings_Practice;

public class Concatenate2_strings {

	public static void main(String[] args) {

		String s1 = "PHP Exercises and";
		String s2 = " Python Exercises";
		String s3 = s1.concat(s2); // to add 2 strings and print it as a single string
		System.out.println("The concatenated string: " + s3);
		
		String s4 = s1+s2; // using + operator also we can concatenate
		System.out.println("using + operator we can concate as: " + s4);

	}

}

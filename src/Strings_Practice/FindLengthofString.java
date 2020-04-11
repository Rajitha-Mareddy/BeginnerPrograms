package Strings_Practice;

public class FindLengthofString {

	public static void main(String[] args) {
		
		String s = "I LIKE JAVA CODING";
		
		int s1 = s.length();
		
		System.out.println(s1);
		
		for (int i = 0; i<s1;i++)
		{
			System.out.println(s.charAt(i)); // giver all the characters of string
			System.out.println(s.charAt(2)); // gives the character at position 2
			System.out.println(s.codePointAt(12)); // gives the unicode value
			System.out.println(s.codePointBefore(2)); // gives unicode value before the given index
			System.out.println(s.codePointCount(0, 5));
		}

	}

}

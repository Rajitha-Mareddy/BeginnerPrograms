package Strings_Practice;

public class ByteArray_CharArray {

	public static void main(String[] args) {
		String s1 = "This is a sample String";
//		byte b[] = s1.getBytes();	// string is moved to byte array
//		for (int i =0;i<b.length;i++)
//		{
//		System.out.println(b[i]); // gives the byte value of each character in string
//		}
//		String s2 = new String(b); // gettimg back the string from array
//		System.out.println(s2);
		
		char c[] = new char[20];
		System.out.println(c);
		s1.getChars(0, 7, c, 3); //prints the characters in b/w 0 to 7 in char array that starts from index 3 in "C" array
		System.out.println(c);
	}

}

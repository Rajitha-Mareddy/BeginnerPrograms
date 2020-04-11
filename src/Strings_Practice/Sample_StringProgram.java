package Strings_Practice;

public class Sample_StringProgram {

	public static void main(String[] args) {

		String str = "GeeksforGeeks";
		String i = "11";
		String i1 = "11";
		String str1 = "GeeksforGeeks";
		String str2 = "GeeksforGEEKS";
		String str3 = "johnS";
		String str4 = "john";
		
		

		System.out.println(str);

		// Concate() method and // + operator
		String a = str.concat(i); // concate using concat() method
		String b = str + i; // concate using + operator

		// equals() method
		System.out.println(str.equals(i)); // if values of str,i are not equal it gives false
		System.out.println(str.equals(str1)); // if values of str,i are equal it gives true

		// == operator (to compare strings references in memory -> if both strings
		// refere to same object it gives true else false/

		System.out.println(str == str1); // both strings referring to same object so it returns true
		System.out.println(str == i); // both strings referring to different object so it returns false
		
		// equalsIgnoreCase() method
		System.out.println(str.equals(str2)); //it gives false bcz it has small & cap's value i.e different 
		System.out.println(str.equalsIgnoreCase(str2)); //it gives true as it ignores small & cap's value (but the value should be same)
		
		// CompareTo() method
		System.out.println(str.compareTo(str1)); //gives 0 as values are equal
		System.out.println(str3.compareTo(str4)); //gives 1 as s3>s4
		System.out.println(str4.compareTo(str3)); //gives -1 as s3<s4
		
		

	}

}

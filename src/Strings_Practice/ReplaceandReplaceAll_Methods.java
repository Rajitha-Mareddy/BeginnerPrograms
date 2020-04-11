package Strings_Practice;

public class ReplaceandReplaceAll_Methods {

	public static void main(String[] args) {
		
		String s1 = "The quick brown fox jumps over the lazy dog.";
		System.out.println("Original String : " + s1);
		System.out.println("New String: " + s1.replace("d", "f"));// replace() method is used to change the old and new char
		
//		String s3 = s1.replaceAll("fox", "cat");
//		System.out.println("New string using replaceAll(): " + s3);
		String s3 = s1.replace("fox", "cat");
		System.out.println(s3);

	}

}

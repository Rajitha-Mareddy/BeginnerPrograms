package Strings_Practice;

public class charArray {

	public static void main(String[] args)
	{
		//to move string into character array and get the required substring using getchars() method
		String s= "Java Exercises" ;
		char ch[] = new char[14];
		s.getChars(0, 14, ch, 0);
		System.out.println(ch);
		
		//lowercase() method
		
		System.out.println("lowercase() method");
		String t = s.toLowerCase();
		System.out.println(t);
		
		//uppercase method 
		
		System.out.println("uppercase() method");
		String u = s.toUpperCase();
		System.out.println(u);
		
		//trim() method
		System.out.println("trim() method");
		String q = "    JavaExercises   ";
		String e = q.trim();
		System.out.println(e);	
		
		
		

	}

}

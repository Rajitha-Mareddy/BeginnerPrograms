package Strings_Practice;

public class abc {

	public static void main(String[] args) {
		String s1="this is index of example is";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8 
		
		// String s= s1.replace('s','t');
		String s= s1.replaceAll(" ", "s");
		System.out.println(s);

	}

}

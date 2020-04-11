package samplePrograms;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) 
		
		
		{
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int a = in.nextInt();  
			System.out.print("Input the second number: ");
			int b = in.nextInt(); 
			System.out.println("Result: "+result(a, b));
	    }
		public static int result(int a, int b)
	     {  
		if(a == b)
			return 0;
//		    if(a % 6 == b % 6)
//			    return (a < b) ? a : b;
//		    return (a > b) ? a : b;
		int c =(a>b?a:b);
		return c;
		 
	     }
	}

package samplePrograms;

import java.util.Scanner;

public class Basic_arithmetic_of_2_operations {
	
	public static void main(String[] args)
	{
		int a;
		int b;
		int add,subtract,multiply;
		
		float division;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b =sc.nextInt();
		
		add = a+b;
		subtract =a-b;
		multiply = a*b;
		division =a/b;
		
		System.out.println("Addition of 2 numbers : " +add);
		System.out.println("Subtraction of 2 numbers : " +subtract);
		System.out.println("Multiplication of 2 numbers : " +multiply);
		System.out.println("Division of 2 numbers : " +division);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

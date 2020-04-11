package samplePrograms;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isprime = false;
		for (int i = 2; i <= n; i++) 
		{
			if(n%i==0)
			{
				isprime =false;
				}
		}
			
			if (isprime=true)
			{
				System.out.println(n +" is a prime number");
			
			}
			else 
			{
				System.out.println(n +" is not a prime number");
			}
			
	
		
		
		sc.close();

	}

}

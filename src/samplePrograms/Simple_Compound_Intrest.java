package samplePrograms;

import java.util.Scanner;

public class Simple_Compound_Intrest {

	public static void main(String[] args) {
		
		double p,t,r,n,i,SI,CI;
		Scanner sc = new Scanner(System.in);
		p=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		n=sc.nextDouble();
		i=sc.nextDouble();
		System.out.println("Enter the value of p :" +p);
		System.out.println("Enter the value of t :"+t);
		System.out.println("Enter the value of r :"+r);
		System.out.println("Enter the value of n :"+n);
		System.out.println("Enter the value of i :"+i);
		
		SI = (p*t*r)/100;
		CI = p* Math.pow((1+(r/n)),(n*t));
		
		System.out.println("Simple intrest : " +SI);
		System.out.println("Simple intrest : " +CI);
		
		

	}


}

package samplePrograms;

import java.util.Scanner;

public class Sampleprogr {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt();
		            
		            if( N%2 != 0)
		            {

		                System.out.println("Weird"); 
		            }
		            
		                        
		            else if(( N%2 == 0)&&(2<N<<5))
		            {
		            
		            System.out.println("Not Weird");
		            }
		           else if(( N%2 == 0) && (6<N<<20))
		            {
		            
		            System.out.println("Weird");
		            }
		            else if (( N%2 == 0) && (N>=20))
		            {
		            
		            System.out.println("Weird");
		            }
		                       }
	

	}



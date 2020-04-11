package samplePrograms;

public class Reverse_A_Number {

	public static void main(String[] args) {

		int num = 111;
		int r;
		int sum = 0;
		int temp =num;

		while (num > 0) {
			r = num % 10; 		// to isolate the last digit(from the number given)
			num = num / 10; 	// to store the remaining number apart from the isoloated value
			sum = sum * 10 + r; // here u have to increase the position value of isolated number so its * 10 // // we use sum variable to add the last digit value till loop ends
		}					
			
			
			if(temp==sum)
			{
				System.out.println(temp + " is a palindrome");
			
			}
			else
			{
				System.out.println(temp + " is not a palindrome");
			}
		}

	}


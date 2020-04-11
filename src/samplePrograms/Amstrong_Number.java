package samplePrograms;

public class Amstrong_Number {

	public static void main(String[] args) {
		
		
		int num = 153;
		int temp = num;
		int r,result=0;
		
		while (num>0)
		{
		r = num%10;
		num =num/10;
		result =result + r*r*r;
		}
		
		if(result==temp)
		{
			System.out.println(temp + " is a Armstrong number");
		}
			else
			{
				System.out.println(temp + " is not  a Armstrong number");
			}
			
			
		}
		
	}


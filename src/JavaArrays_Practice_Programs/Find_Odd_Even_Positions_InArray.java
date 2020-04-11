package JavaArrays_Practice_Programs;

public class Find_Odd_Even_Positions_InArray {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;

		System.out.println("Length of array is : " + a.length);
		
		System.out.println("print even positions of array");
		
		for (int i = 0;i<a.length;i = i+2) // to print even positions 0,2,4,6 ... we have incremented i by 2 so that it skips in between numbers and go for even positions
		 
		{
			
				System.out.println(a[i]);
			
		}
		System.out.println("print odd positions of array");
		
		for (int i = 1;i<a.length;i = i+2) // to print even positions 0,2,4,6 ... we have incremented i by 2 so that it skips in between numbers and go for even positions
		 
		{
			
				System.out.println(a[i]);
			
		}


	}

}

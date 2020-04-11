package JavaArrays_Practice_Programs;

public class DeclareArray {

	public static void main(String[] args) {
		int a[] = new int[5]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		System.out.println("Length of array is : " + a.length);
		// use for loop to traverse an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Declare,instantiate and initialize an array in a single line//
		String b[] = { "Rajitha", "Anu", "Abhi" };

		// System.out.println(b[0]);
		for (String i : b) {
			System.out.println(i);

		}
		
		System.out.println("Declare 2 dimensioanl array");
		// int a1[][] = new int[3][3];
		int a1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i =0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}

package JavaArrays_Practice_Programs;

public class Copy_Array {

	public static void main(String[] args) {
		// Array 1

		int a[] = new int[3]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		
		System.out.println("Length of array is : " + a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Array 2

		int b[] = new int[3]; // single dimensional array //
		b[0] = 300;
		b[1] = 500;
		b[2] = 600;
		
		System.out.println("Length of array is : " + b.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("Copy array 2 to 1");
		for (int i = 0; i < b.length; i++) {
		a[i]= b[i];
		System.out.println(a[i]);
		}
		
		}

	}


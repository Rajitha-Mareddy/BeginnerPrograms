package JavaArrays_Practice_Programs;

public class SmallestElement_InArray {

	public static void main(String[] args) {

		int a[] = new int[5]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		int min = a[0];

		System.out.println("Length of array is : " + a.length);

		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) // here we are comparing the a[0] with the rest of numbers in the loop
			{

				min = a[i]; // if any number is less than a[0] that value goes to min, like wise loops
							// continuos and the smallest number will be printed

			}

		}
		System.out.println("Minimum/Smallest number in given array is : " + min);

	}

}

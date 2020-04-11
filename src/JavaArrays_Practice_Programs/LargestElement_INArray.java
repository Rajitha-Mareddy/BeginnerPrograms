package JavaArrays_Practice_Programs;

public class LargestElement_INArray {

	public static void main(String[] args) {

		int a[] = new int[5]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		int max = a[0];

		System.out.println("Length of array is : " + a.length);

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) // here we are comparing the a[0] with the rest of numbers in the loop
			{

				max = a[i]; // if any number is greater than a[0] that value goes to max, like wise loops
							// continuos and the largest number will be printed

			}

		}
		System.out.println("Maximum/Largest number in given array : " + max);

	}

}

package JavaArrays_Practice_Programs;

public class Duplicates_InArray {

	public static void main(String[] args) {

		int a[] = new int[5]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		a[3] = 5;
		a[4] = 6;

		System.out.println("Length of array is : " + a.length);

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			for (int j = i + 1; j < a.length; j++) // this compares first and 2nd elements, and then 2, 3.... and chks
													// if duplicates present or not
			{
				if (a[i] == a[j]) // After comparison if any duplicate elements presents then that will be stored
									// in a[j]
				{
					System.out.println(a[j]);
				}
			}

		}

	}

}

package JavaArrays_Practice_Programs;

public class SumOfElements_inArray {

	public static void main(String[] args) {

		int a[] = new int[5]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		int sum = a[0];

		System.out.println("Length of array is : " + a.length);

		for (int i = 1; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}

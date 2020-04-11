package JavaArrays_Practice_Programs;

public class Reverse_AnArray {

	public static void main(String[] args) {
		int a[] = new int[3]; // single dimensional array //
		a[0] = 3;
		a[1] = 5;
		a[2] = 6;
		
		System.out.println("Length of array is : " + a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Reverse an array");
		for(int i =a.length-1;i>=0;i--)
		{
			System.out.println("Reverse of an array is : "+ a[i]);
		}

	}

}

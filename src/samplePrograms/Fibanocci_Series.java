package samplePrograms;

public class Fibanocci_Series {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, count = 5, n3, i = 0;
		while (i <= count) {

			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;

		}

	}

}

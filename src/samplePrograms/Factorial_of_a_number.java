package samplePrograms;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		int num = 5;
		int factorial = num;
		int i = 1;

		while (i <= num-1) {
			factorial = factorial * i;

			i++;

		}
		System.out.println(factorial);
	}

}

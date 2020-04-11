package samplePrograms;

import java.util.Random;
import java.util.Scanner;

public class Random_number_in_given_range {

	public static void main(String[] args) {

		// This Java program asks the user to provide maximum range, and generates a
		// number within the range.//

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int value = sc.nextInt();

		for (int i = 0; i < 10; i++)
		{
			System.out.println(r.nextInt(value));
		}
		sc.close();
	}

}

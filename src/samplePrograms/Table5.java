package samplePrograms;

import java.time.Month;

public class Table5 {

	public static void main(String[] args) {

		int table = 5;
		int count = 15;
		int i;
		
		for (i = 1; i <= count; i++) {

			int total = table * i;

			System.out.println(table + "*" + i + "=" + total);
		}

	}

}

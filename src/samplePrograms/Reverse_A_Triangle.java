package samplePrograms;

public class Reverse_A_Triangle {

	public static void main(String[] args) {

		/*
		 * int count = 8; for (int i=count;i>0;i--) { for(int j=1;j<=i;j++) {
		 * System.out.print('*');
		 * 
		 * }
		 * 
		 * System.out.println("\n"); }
		 */
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i > j) {
					System.out.print("*");
				}

			}
			System.out.println("\n");
		}

	}

}

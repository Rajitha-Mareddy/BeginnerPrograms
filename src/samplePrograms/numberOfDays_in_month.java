package samplePrograms;

public class numberOfDays_in_month {

	public static void main(String[] args) {

		int month = 11;
		switch (month) {
		case 1:
		case 3:
		case 7:
		case 10:
		case 8:
		case 5:
		case 12:
			System.out.println("numOfDays = 31");
			break;
		case 2:
			System.out.println("numOfDays = 29");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("numOfDays = 30");
			break;
		default:
			System.out.println("No matching");
		}
	}
}

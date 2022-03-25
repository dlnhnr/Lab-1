import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a year:");
		int year = scan.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("The year entered is a leap year");
		} else {
			System.out.println("The year entered is not a leap year");
		}
		
		scan.close();
	}
}

import java.util.HashSet;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {

		HashSet<String> states = new HashSet<String>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the states you have visited one at a time. Type 'done' to end the program.");

		while (true) {
			System.out.println("State name:");
			String input = scan.nextLine().toLowerCase();

			if (input.equals("done")) {
				break;
			}
			else {
				states.add(input);
			}
		}
		System.out.println(states);
		scan.close();
	}
}
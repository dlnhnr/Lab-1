import java.util.Scanner;

public class Solution1 {

	static String reverseInput(String input) {

		String[] stringArray = input.split(" ");
		String output = "";

		for (int i = stringArray.length - 1; i >= 0; i--) {
			output += stringArray[i] + " ";
		}

		return output;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a sentence and the words will be printed in reverse order:");
		System.out.println("Sentence reversed: " + reverseInput(input.nextLine()));

		input.close();
	}
}

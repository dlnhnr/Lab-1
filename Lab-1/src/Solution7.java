import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter an integer");
			int a = scan.nextInt();

			System.out.println("Enter another integer");
			int b = scan.nextInt();

			scan.close();

			System.out.println(a + " / " + b + " = " + a / b);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
		} finally {
			System.out.println("Thank you");
		}
	}
}

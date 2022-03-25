import java.util.Scanner;

public class Solution5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a decimal number:");
		
		double num = scan.nextDouble();
		
		System.out.println("The ceil of " + num + " is: " + Math.ceil(num));
		System.out.println("The floor of " + num + " is: " + Math.floor(num));
		System.out.println(num + " rounded to the nearest integer is " + Math.round(num));
		
		scan.close();
	}
}

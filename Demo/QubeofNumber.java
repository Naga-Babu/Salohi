package Demo;

import java.util.Scanner;

public class QubeofNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= num; i++) {
			int mul = i * i * i;
			System.out.println("The cube of " + i + " is :" + mul);
		}

	}

}

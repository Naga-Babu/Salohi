package Patterns_pratice;

import java.util.Scanner;

public class Rightr_angle_tri_num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = scanner.nextInt();
		scanner.close();

		System.out.println("Right angle triangle pattern with numbers:");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1;i<=rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
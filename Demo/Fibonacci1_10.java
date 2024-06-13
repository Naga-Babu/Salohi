package Demo;

public class Fibonacci1_10 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Fibonacci series up to " + n + " terms:");
		printFibonacci(n);
	}

	public static void printFibonacci(int n) {
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= n; ++i) {
			System.out.println(num1 + " ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}

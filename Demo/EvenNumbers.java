package Demo;

public class EvenNumbers {

	public static void main(String[] args) {
		int number = 123456789;
		int temp = number;
		int sum = 0;

		System.out.println("Even numbers in " + number + ": ");
		while (temp != 0) {
			int digit = temp % 10;

			if (digit % 2 == 0) {
				System.out.println(digit + " ");
				sum = sum + digit;
			}
			temp /= 10;

		}
		System.out.println("sum of even numbers :" + sum);

	}

}
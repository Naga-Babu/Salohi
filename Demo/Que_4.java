package Demo;

public class Que_4 {

	public static void main(String[] args) {
		double input = 1500000;
		if (input > 0) {
			if (input < 1) {
				System.out.println("small positive nmber");
			} else if (input > 1000000) {
				System.out.println("larger positive number");
			} else {
				System.out.println("positive nujmber");
			}
		} else if (input < 0) {
			if (Math.abs(input) < 1) {
				System.out.println("small negative nmber");
			} else if (Math.abs(input) > 1000000) {
				System.out.println("larger negative number");
			} else {
				System.out.println("negative nujmber");
			}
		} else {
			System.out.println("neighter positive nor negative");

		}

	}

}

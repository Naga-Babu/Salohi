package Demo;

public class Quadratic {

	public static void main(String[] args) {
		double a = 1, b = 5, c = 1;
		double res = (b * b - 4 * a * c);
		if (res > 0) {
			double r1 = b + (Math.pow(res, 0.5) / 2 * a);
			double r2 = b - (Math.pow(res, 0.5) / 2 * a);
			System.out.println(r1 + " " + r2);
		} else if (res == 0) {
			double r3 = b / 2 * a;
			System.out.println(r3);
		} else {
			System.out.println("it dosen't have real roots");
		}
	}
}
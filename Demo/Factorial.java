package Demo;

public class Factorial {

	public static void main(String[] args) {
		int num=10;
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of 10 is:"+fact);

	}

}

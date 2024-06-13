package Demo;

public class Assignment_1 {

	public static void main(String[] args) {
		int num1 = 60;
		int num2 = 78;
		int num3 = 87;
		
		int greatest = num1;
		if (num2 > greatest) {
			greatest = num2;
		}
		if(num3 > greatest) {
			greatest = num3;
		}
		System.out.println("The greatest: " + greatest);

	}

}

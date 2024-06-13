package Demo;

public class Number {
	public static void main(String arga[]) {
		int num=20;
		switch(num%2) {
		case 0:System.out.println(num+"is even");
		break;
		case 1:System.out.println(num+"odd");
		break;
		default:System.out.println("Invalid number");
		break;
		}
		
		
	}

}

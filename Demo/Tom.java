package Demo;

public class Tom {

	public static void main(String[] args) {
		int num=23;
		if(num%2==0 && num>10 && num<25) {
			System.out.println("Tom");
		}
		else if(num%2!=0 && num>10 && num<25) {
			System.out.println("Jerry");
		}
		else {
			System.out.println("Tom and Jerry");
		}
		

	}

}

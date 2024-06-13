package Patterns_pratice;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=7;
		int space=3;
		int star=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<4) {
				star=star-1;
				space=space-1;
			}
			else{
				star=star-1;
				space=space-1;
			}
			System.out.println();
		}

	}

}

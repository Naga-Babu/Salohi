package Scanner;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		int f1=0,f2=1,f3;
		System.out.println(f1);
		
		for(int i=1;i<=number;i++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}
package Scanner;
import java.util.Scanner;
public class Even 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		if (number % 2 == 0)
		{
			System.out.println("The given number is even.");
			int sum = 0;
	        for (int i = 1; i < number; i++) 
	        {
	            if (number % i == 0) 
	            {
	                sum = sum + i;
	            }
	        }

	        if (number == sum) 
	        {
	            System.out.println("The given number is Perfect Number");
	        } 
	        else 
	        {
	            System.out.println("The given number is Not a Perfect Number");
	        }
		}
		
		else
		{
			System.out.println("The given number is odd.");
		}
	}
}
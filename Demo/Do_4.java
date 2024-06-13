package Demo;

public class Do_4 {

	public static void main(String[] args) {
		int num = 50; 

       
        int count = 0;
        do {
            if (num % 2 == 0) { 
                System.out.println(num);
                count++;
            }
            num--; 
        } while (count < 21 && num >= 30);
		

	}

}

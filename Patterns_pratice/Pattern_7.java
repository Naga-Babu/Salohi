package Patterns_pratice;

public class Pattern_7 {

	public static void main(String[] args) {
		int rows = 4;
        int cols = 4;

        
        for (int i = 0; i < cols; i++) {
            
            for (int j = 0; j < rows; j++) {
                
                if (i %2==0) {
                    System.out.print("# "); 
                } else {
                    System.out.print("* "); 
                }
            }
            System.out.println(); 
        }

	}

}

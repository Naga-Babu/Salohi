package Patterns_pratice;

public class Star_1 {

	public static void main(String[] args) {
		int rows = 4;
        int cols = 4;

        
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                
                if (j == 0 || j == 2) {
                    System.out.print("* "); 
                } else {
                    System.out.print("# "); 
                }
            }
            System.out.println(); 
        }


	}

}

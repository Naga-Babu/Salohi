package Demo;

public class Loop1 {
	public static void main (String args[]) {
		int evencount=0;
		int oddcount=0;
		for(int i=30;i<=60;i++) {
			if(i%2==0) {
				evencount++;
			}else{
			oddcount++;
		}
		
		}
		System.out.println(evencount);
		System.out.println(oddcount);

	}}

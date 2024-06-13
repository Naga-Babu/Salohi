package Demo;

public class Prime2 {

	public static void main(String[] args) {
		int m=1;
		int n=100;
		System.out.println("Prime number between "+m+" to"+n);
		for(int i=m;i<=n;i++) {
			int num=i;
			int count=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num);
		}

	}

}
}

import java.util.Scanner;

public class java_a9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				if(i % j == 0 ) {
					count++;
					System.out.println(i);
				}
				
			} if(count==1) {
				System.out.println(i);
			}
			count=0;
		}
	}

}

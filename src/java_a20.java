import java.util.Scanner;

public class java_a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num_1 = scan.nextInt();
		int num_2 = scan.nextInt();
		
		
		
		if(num_1<num_2) {
			int GCD = num_1;
			for(int i = GCD; i < num_2 ; i-- ) {
				if(num_1 % i == 0 && num_2 % i == 0 ) {
					System.out.println(i);
					break;
				}
			}
			
		} else if(num_1>num_2) {
			int GCD = num_2;
			for(int i = GCD; i < num_1 ; i--) {
				if(num_1 % i == 0 && num_2 % i == 0 ) {
					System.out.println(i);
					break;
				}
			}
		}
		
		
	
			
		
		
	}

}

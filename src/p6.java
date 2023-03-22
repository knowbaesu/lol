import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int calculater = scan.nextInt();
		int num_1 = scan.nextInt();
		int num_2 = scan.nextInt();
		if (calculater==1) {
			System.out.println(num_1 + num_2);
		}else if (calculater==2) {
			System.out.println(num_1 - num_2);
		}else if (calculater==3) {
			System.out.println(num_1 * num_2);
		}else if (calculater==4) {
			System.out.println(num_1 / num_2);
		}
		
		scan.close();
	}

}

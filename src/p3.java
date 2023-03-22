import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int pay = scan.nextInt();
		int change = scan.nextInt();
		
		int charge = pay - change;
		System.out.println(charge);
		
		int money10000 = 0;
		int money5000 = 0;
		int money1000 = 0;
		int money500 = 0;
		int money100 = 0;
		int money50 = 0;
		int money10 = 0;
		
		money10000 = charge / 10000;
		money5000 = (charge % 10000) / 5000;
		money1000 = (charge % 5000) / 1000;
		money500 = (charge % 1000) / 500;
		money100 = (charge % 500) / 100;
		money50 = (charge % 100) / 50;
		money10 = (charge % 50) / 10;
		
		System.out.println("10000 -" + money10000);
		System.out.println("5000 -" + money5000);
		System.out.println("1000 -" + money1000);
		System.out.println("500 -" + money500);
		System.out.println("100 -" + money100);
		System.out.println("50 -" + money50);
		System.out.println("10 -" + money10);
		
		scan.close();
		
	}

}

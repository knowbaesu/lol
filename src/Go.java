import java.util.Scanner;

public class Go {

	public static void main(String[] args) {
		
		inputNumbers1();
		inputNumbers2(); //no static
		
		Go nm = new Go();
		nm.inputNumbers2();
		nm.inputNumbers3();
		nm.inputNumbers4();
		nm.inputNumbers5();
		
		
		
	}
	
	
	public static int inputNumbers1() {
		Scanner scan = new Scanner(System.in);
		int num_1;
		while(true) {
			num_1= scan.nextInt();
		if(num_1 % 2 ==1) {
			if (num_1 > 0 && num_1<1000 )
				System.out.println("ok");
			break;
		}
		
		System.out.println("not ok");
		
		
		}
		
		
		return num_1;
	}

	public int inputNumbers2() {
		Scanner scan = new Scanner(System.in);
		int num_1;
		while(true) {
			num_1= scan.nextInt();
		if(num_1 % 2 ==1) {
			if (num_1 > 0 && num_1<1000 )
				System.out.println("ok");
			break;
		}
		
		System.out.println("not ok");
		
		
		}
		
		
		return num_1;
	}
	private int inputNumbers3() {
		Scanner scan = new Scanner(System.in);
		int num_1;
		while(true) {
			num_1= scan.nextInt();
		if(num_1 % 2 ==1) {
			if (num_1 > 0 && num_1<1000 )
				System.out.println("ok");
			break;
		}
		
		System.out.println("not ok");
		
		
		}
		
		
		return num_1;
	}
	protected int inputNumbers4() {
		Scanner scan = new Scanner(System.in);
		int num_1;
		while(true) {
			num_1= scan.nextInt();
		if(num_1 % 2 ==1) {
			if (num_1 > 0 && num_1<1000 )
				System.out.println("ok");
			break;
		}
		
		System.out.println("not ok");
		
		
		}
		
		
		return num_1;
	}
	 int inputNumbers5() {
		Scanner scan = new Scanner(System.in);
		int num_1;
		while(true) {
			num_1= scan.nextInt();
		if(num_1 % 2 ==1) {
			if (num_1 > 0 && num_1<1000 )
				System.out.println("ok");
			break;
		}
		
		System.out.println("not ok");
		
		
		}
		
		
		return num_1;
	}
}
	

import java.util.Scanner;

public class JAVA_P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int temper = scan.nextInt();
		
		
		if (num==1) {
			System.out.println(Math.round(temper*9/5)+32);
		} else {
			System.out.println(Math.round(temper-32)* 5/9);
		}
	}    

}

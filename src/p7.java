import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What number do yo want?");
		int num = scan.nextInt();
		if (num == 2 || num <= 9) {
			 System.out.println(num +"X"+ "2"+"="+(num*2));
			 System.out.println(num +"X"+ "3"+"="+(num*3));
			 System.out.println(num +"X"+ "4"+"="+(num*4));
		     System.out.println(num +"X"+ "5"+"="+(num*5));
			 System.out.println(num +"X"+ "6"+"="+(num*6));
			 System.out.println(num +"X"+ "7"+"="+(num*7));
			 System.out.println(num +"X"+ "8"+"="+(num*8));
			 System.out.println(num +"X"+ "9"+"="+(num*9));
		} else {
			System.out.println("구구단에 없는 수 입니다. 다시 입력해 주세요");
		}
		scan.close();
	}

}

package java07;

public class java_a7 {

	public static void main(String[] args) {
		int num_1 = 4;
		int num_2 = 12;
		int LCM = num_1;
		
		while(true) {
			LCM++;
			if(LCM % num_1  == 0 && LCM % num_2==0){
			break;
			}
			System.out.println(LCM);
		}
		System.out.println(LCM);
	}
	
}

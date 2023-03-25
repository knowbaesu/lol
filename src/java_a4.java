public class java_a4 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i<=(n-1);i++) {
			for(int k=i; k<=n; k++) {
				System.out.print(" ");
			}
			for (int j =1;j<=(2*i)+1;j++) {
				System.out.print("*");	
			}
			
			System.out.println();
		}
		
	}

}

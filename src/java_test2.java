public class java_test2 {

	public static void main(String[] args) {
		int i = 2;
		int j = 2;
		
		
		while(i<10) {
			while(j<10) {
				System.out.print(j + "X" + i + "=" + (i*j)+" "  );
				j++;
			}
			j=2;
			i++;
			System.out.println();
		}
	}

}


// i ==2 j ==
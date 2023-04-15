public class JAVA_P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "This is a apple ";
		
		
	
		int d = 0;
		
		char[] c = text.toCharArray();
		System.out.println((byte)text.charAt(4));
		for (int i=0; i<text.length();i++) {
			
			if( (byte)(text.charAt(i)) == 97 ) {
				if((byte)(text.charAt(i+1)) == 32 && (byte)(text.charAt(i+2)) == 97 ) {
					d++;
					
					
					
				} else if ((byte)(text.charAt(i)+1) == 32 && (byte)(text.charAt(i)+2) == 101) {
					
					System.out.println();
				} else if ((byte)(text.charAt(i)+1) == 32 && (byte)(text.charAt(i)+2) == 105) {
					
					
				} else if ((byte)(text.charAt(i)+1) == 32 && (byte)(text.charAt(i)+2) == 111) {
					
					
				} else if ((byte)(text.charAt(i)+1) == 32 && (byte)(text.charAt(i)+2) == 117) {
					
				
				}
			} 
			
			System.out.print(d);
			
			
		} 
		
	}

}

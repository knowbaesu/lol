package java09;

public class overLoading {

	public static void main(String[] args) {
		print("Hello world");
		print(1,3);

	}
	
	

	
	public static void print(int a, int b) {
		System.out.println( a + b );
	}
	
	public static void print(String line) {
		System.out.println(line);

 }
}
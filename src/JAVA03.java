package JAVA_0308;

import java.util.Date;

public class JAVA03 {

	public static void main(String[] args) {
		TestA testA = new TestA();
		testA.showName();
		TestB testB = new TestB();
		testB.showHobby();
		TestA testA2 = new TestA();
		testA2.showName();
		
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
	}

}

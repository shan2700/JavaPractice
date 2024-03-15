package scan;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
				
			int a =sc.nextInt();
			int b =sc.nextInt();

			int res = a + b ;
			System.out.println(res);
	    }	
	}
}

package AOJ;

import java.util.Scanner;

public class IPT1_4_A {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		System.out.println(a/b);
		System.out.println(Math.floorMod(a, b));
		System.out.println(String.format("%.5f",(double)a/b));
		
	}

}

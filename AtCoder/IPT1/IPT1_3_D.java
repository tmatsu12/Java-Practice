package AOJ;

import java.util.Scanner;

public class IPT1_3_D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int j = 0;
		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				j ++;
			}
			
		}
		System.out.println(j);
		scanner.close();
		
	}

}

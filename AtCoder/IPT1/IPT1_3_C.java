package AOJ;

import java.util.Scanner;

public class IPT1_3_C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x == 0 && y == 0) break;
			if (x < y) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
			
		}
		scanner.close();
	}

}

package AOJ;

import java.util.Scanner;

public class IPT1_3_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j = 1;
		while(true) {
			int x = scanner.nextInt();
			if (x == 0) break;
			System.out.println("Case" + " " + j + ":" + " " + x);
			j ++;
		}
		scanner.close();
	}

}

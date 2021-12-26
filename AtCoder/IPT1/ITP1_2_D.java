package AOJ;

import java.util.Scanner;

public class ITP1_2_D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		if (x < r || x > W-r || y < r || y > H-r) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}

}

package AOJ;

import java.util.Scanner;

public class ITP1_7_A {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int m = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int sum = m + f;
			if (m == -1 && f == -1 && r == -1) break;
			if (m == -1 || f == -1) {
				System.out.println("F");
			}
//			最初は19行目をelse if でなくifとしていて、-1 50 -1の時にDになってしまっていた
			else if (sum >= 80) {
				System.out.println("A");
			} else if (sum >= 65 && sum < 80) {
				System.out.println("B");
			} else if (sum >= 50 && sum < 65) {
				System.out.println("C");
			} else if (sum >= 30 && sum < 50) {
				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
			
		}
		
		scanner.close();		
		
	}

}

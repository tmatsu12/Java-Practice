package AOJ;

import java.util.Scanner;

public class ITP1_5_D {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 1; i<=n; i++) {
			String str = String.valueOf(i);
			if ((i % 3 == 0) || (str.contains("3"))) {
				System.out.print(" ");
				System.out.print(i);
			}
		}
		
	}

}

package AOJ;

import java.util.Scanner;

public class ITP1_5_C {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			if (H == 0 && W == 0) break;
			for (int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if ((i % 2 == 0) && (j % 2 == 0)) {
						System.out.print("#");
					} else if ((i % 2 == 0) && (j % 2 != 0)) {
						System.out.print(".");
					} else if ((i % 2 != 0) && (j % 2 == 0)) {
						System.out.print(".");
					} else {
						System.out.print("#");
					}
				}
				System.out.println();
				
			}
			System.out.println();
			
		}
		
	}

}

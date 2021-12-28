package AOJ;

import java.util.Scanner;

public class ITP1_7_C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();		
		int c = scanner.nextInt();		
		int[][] a = new int[r][c];
		int[][] b = new int[r+1][c+1];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = scanner.nextInt();
				b[i][j] = a[i][j];
			}
		}
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				 b[i][c] += a[i][j];
			}
		}
		for(int j = 0; j < c; j++) {
			for(int i = 0; i < r; i++) {
				 b[r][j] += a[i][j];
			}
		}
		for(int j = 0; j < c; j++) {
			b[r][c] += b[r][j];
		}
		for(int i = 0; i <= r; i++) {
			for(int j = 0; j <= c; j++) {
				if(j > 0) System.out.print(" ");
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
	}

}

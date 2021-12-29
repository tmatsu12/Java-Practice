package AOJ;

import java.util.Scanner;

public class ITP1_7_D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		
		int m = scanner.nextInt();		
		int l = scanner.nextInt();		
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		long[][] c = new long[n][l];
		for(int i = 0; i < n; i++)for(int j = 0; j < m; j++) a[i][j] = scanner.nextInt();	
		for(int i = 0; i < m; i++)for(int j = 0; j < l; j++) b[i][j] = scanner.nextInt();	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				if(j > 0) System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		scanner.close();
	}
	

}

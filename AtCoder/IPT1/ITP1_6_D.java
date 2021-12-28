package AOJ;

import java.util.Scanner;

public class ITP1_6_D {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		for (int i=0; i<m; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				c[i] += a[i][j] * b[j];
			}
			System.out.println(c[i]);
		}
		scanner.close();
		
	}

}

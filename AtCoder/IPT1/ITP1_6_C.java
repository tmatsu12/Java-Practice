package AOJ;

import java.util.Scanner;

public class ITP1_6_C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i ++) {
			a[i] = scanner.nextInt();
		}
		for(int j = 0; j < n; j ++) {
			if(j > 0) System.out.print(" ");
			System.out.print(a[n-j-1]);
		}
		System.out.println();
	}

}

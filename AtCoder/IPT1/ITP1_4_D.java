package AOJ;

import java.util.Scanner;

public class ITP1_4_D {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		long sum = 0;
		for(int i=0; i<n; i++) {
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		System.out.println(calcMin(a) + " " + calcMax(a) + " "+ sum);	
				
	}
	
	public static long calcMax(long[] a) {
		long max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		return max;
		
	}
	
	public static long calcMin(long[] a) {
		long min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		return min;
		
	}

}

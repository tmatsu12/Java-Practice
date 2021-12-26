package AOJ;

import java.util.Scanner;

public class IPT1_4_B {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		scanner.close();
		double area = Math.PI* r * r;
		double length = 2 * Math.PI* r;
		System.out.printf(String.format("%.6f", area)+" "+String.format("%.6f", length));	
	}

}

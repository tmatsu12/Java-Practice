package AOJ;

import java.util.Scanner;

public class ITP_4_C {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		
		switch(op) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		default:
			break;
			
		}
		
		
	}

}

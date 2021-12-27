package AOJ;

import java.util.Scanner;

public class ITP1_5_A {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			if (H == 0 && W ==0) break;
			for ( int i = 1; i <= H; i++ ){
				  for ( int j = 1; j <= W; j++ ){ 
				    System.out.print("#");
				  }
				  System.out.println();           
				}
			System.out.println(); 
		}
		
	}

}

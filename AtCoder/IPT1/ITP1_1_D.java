package AOJ;

import java.util.Scanner;

public class ITP1_1_D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		scanner.close();
		int hour = Math.round(time / (60 * 60));				
		int minutes = Math.round((time - 3600 * hour) / 60);				
		int seconds = time - 3600 * hour - 60 * minutes;	
		System.out.println(hour+":"+minutes+":"+seconds);
	}

}

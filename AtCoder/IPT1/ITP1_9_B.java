package AOJ;

import java.util.Scanner;

public class ITP1_9_B {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    while(true){
        String s=scan.next();
        if(s.equals("-"))break;
        int m=scan.nextInt();
        for(int i=0;i<m;i++){
            int h=scan.nextInt();
            String le=s.substring(0,h);
            String ri=s.substring(h,s.length());
            s=ri+le;
        }
        System.out.println(s);
    }
    scan.close();
	}
}

package AOJ;

import java.util.Scanner;

public class ITP1_9_A {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String W=scan.next();
    W=W.toLowerCase();
    int ans=0;
    while(true){
        String T=scan.next();
        if(T.equals("END_OF_TEXT"))break;
        T=T.toLowerCase();
        if(T.equals(W))ans++;
    }
    System.out.println(ans);
    scan.close();
	}
}

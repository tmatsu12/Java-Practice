package AOJ;

import java.util.Scanner;

public class ITP1_8_D {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String s=scan.next();
    String p=scan.next();
    s+=s;
    if(s.indexOf(p)>=0)System.out.println("Yes");
    else System.out.println("No");
    scan.close();
	}
}

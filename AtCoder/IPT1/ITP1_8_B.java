package AOJ;

import java.util.Scanner;

public class ITP1_8_B {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    while(true){
        String x =scan.next();
        if(x.equals("0"))break;
        int ans=0;
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            ans+=c-'0';
        }
        System.out.println(ans);
    }
    scan.close();
	}
}

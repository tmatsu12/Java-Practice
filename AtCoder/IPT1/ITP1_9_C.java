package AOJ;

import java.util.Scanner;

public class ITP1_9_C {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int taro=0,hanako=0;
    int n=scan.nextInt();
    for(int i=0;i<n;i++){
        String s=scan.next(),t=scan.next();
        int val=s.compareTo(t);
        if(val>0)taro+=3;
        else if(val<0)hanako+=3;
        else{
            taro+=1;hanako+=1;
        }
    }
    System.out.println(taro+" "+hanako);
    scan.close();
}
}

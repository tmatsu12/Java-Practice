package AOJ;

import java.util.Scanner;

public class ITP1_10_C {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    while(true){
        int n=scan.nextInt();
        if(n==0)break;
        int[] s=new int[n];
        for(int i=0;i<n;i++)s[i]=scan.nextInt();
        Double m=0.0;
        for(int i=0;i<n;i++)m+=s[i];
        m/=n;
        Double a=0.0;
        for(int i=0;i<n;i++){
            Double dif=s[i]-m;
            a+=dif*dif;
        }
        a/=n;
        a=Math.sqrt(a);
        System.out.printf("%.5f\n",a);
    }
    scan.close();
}
}

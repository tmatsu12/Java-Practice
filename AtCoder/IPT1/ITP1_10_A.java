package AOJ;

import java.util.Scanner;

public class ITP1_10_A {
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    Double x1,y1,x2,y2;
    x1=scan.nextDouble();
    y1=scan.nextDouble();
    x2=scan.nextDouble();
    y2=scan.nextDouble();
    Double dx=x2-x1;
    Double dy=y2-y1;
    Double ans=Math.sqrt(dx*dx+dy*dy);
    System.out.printf("%.5f\n",ans);
    scan.close();
	}

}

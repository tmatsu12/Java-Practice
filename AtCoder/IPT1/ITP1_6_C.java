package AOJ;

import java.util.Scanner;

public class ITP1_6_C {
	public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num[][][]=new int[5][4][11];
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int b=scan.nextInt(),f=scan.nextInt(),r=scan.nextInt(),v=scan.nextInt();
            num[b][f][r]+=v;
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=10;k++){
                    System.out.print(" "+num[i][j][k]);
                }
                System.out.println();
            }
            if(i<4){
                for(int j=0;j<20;j++)System.out.print('#');
                System.out.println();
            }
        }
        scan.close();
    }

}

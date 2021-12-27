package AOJ;

import java.util.Scanner;

public class ITP1_6_B {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    String suit="SHCD";
//    横のサイズを14にしないと13を入れられない
    boolean[][] exist=new boolean[4][14];
    int n=scan.nextInt();
    for(int i=0;i<n;i++){
	    String s=scan.next();
	    int num=scan.nextInt();
	    exist[suit.indexOf(s)][num]=true;
    }
    for(int i=0;i<4;i++){
	    for(int j=1;j<=13;j++){
		    if(!exist[i][j]){
		    	System.out.println(suit.charAt(i)+" "+j);
		    }
	    }
    }
    scan.close();
		
	}	

}

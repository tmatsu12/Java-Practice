package AOJ;

import java.util.Scanner;

public class ITP1_2_C {

	public static void main(String[] args) {
		int[] a = {0,0,0};
        int i,t,j;
        Scanner scanner = new Scanner(System.in);
        for(i=0;i<3;i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
        
        for(i=0;i<3;i++){
            for(j=i+1;j<3;j++){
                if(a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
		
	}

}

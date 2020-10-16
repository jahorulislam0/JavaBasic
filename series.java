
package javaBasic;

import java.util.Scanner;


public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int n;
        System.out.println("enter last number =");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.print(i+"x"+i+" ");
            sum=sum+i*i;
            
            
        }
        System.out.println( );
        
        
        System.out.print("result ="+sum);
        
    }
    
}

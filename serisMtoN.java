
package javaBasic;

import java.util.Scanner;


public class serisMtoN {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int m,n;
        
        System.out.println("enter initial number =");
        m=input.nextInt();
        System.out.println("enter final number =");
        n=input.nextInt();
        
        for (int i = m; i <=n; i++) {
            
                sum=sum+i;
                System.out.print("   "+i);
                
        }
        System.out.println("");
        System.out.println("result="+sum);
        
        
        
    }
}

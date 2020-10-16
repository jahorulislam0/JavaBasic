
package javaBasic;

import java.util.Scanner;


public class cheakh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        int sum=0;
        System.out.println("Enter number =");
        m=input.nextInt();
        
        
        for (int i = 0; i <=m; i++) {
            System.out.print(i+"    ");
            sum=sum+i;
            
        }
        System.out.println("");
        System.out.println("result ="+sum);
    }
    
    
}

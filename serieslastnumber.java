
package javaBasic;

import java.util.Scanner;


public class serieslastnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result=1;
        int n;
        System.out.println("enter last number =");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
            result =result*i;
            
        }
        
        System.out.println("");
        System.out.println("result="+result);
        
    }
    
}

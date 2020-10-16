
package javaBasic;

import java.util.Scanner;


public class FiboncciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        int first=0;
        int secound=1;
        int fibo;
        System.out.println("How many fibonacci number =");
        m=input.nextInt();
        System.out.print(first+" "+secound);
        for (int i = 3; i <=m; i++) {
            fibo=first+secound;
            System.out.println(" "+fibo);
            first=secound;
            secound=fibo;
            
        }
        
        
    }
    
}


package javaBasic;

import java.util.Scanner;


public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,num,sum=0,temp;
        System.out.println("enter any number =");
        num=input.nextInt();
        
        temp=num;
        while (temp!=0){
            r = temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(num==sum)
        {
            
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome number ");
        }
        System.out.println("reverse number= "+sum);
        
        
    }
    
}

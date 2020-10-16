
package javaBasic;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        double num;
        double count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number =");
        num=input.nextDouble();
        for (int i = 2; i <num; i++) {
            if(num%i==0)
            {
                count++;
                break;
                
            }
        }
        if(count==0){
            
            System.out.println("It's prime number 😊😊😊");
        }
        else{
            System.out.println("It's not prime number 😪😪😪");
        }
        
        
    }
    
}

package javaBasic;

import java.util.Scanner;

public class Primenumbermton {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0, totalprime = 0;
        System.out.println("Enter initial number =");
        m = input.nextInt();
        System.out.println("Enter final number =");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;

                }

            }
            if (count == 0) {
                System.out.print(i + "  ");
                totalprime++;
            }

            count = 0;

        }
        System.out.println("");
        System.out.println("total prime number =" + totalprime);

    }

}

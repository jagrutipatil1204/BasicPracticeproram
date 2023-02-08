package practiceprogram;

import java.util.Scanner;

public class Arithmetic {


        public static void main(String[] args)
        {
            int a,b ;
            System.out.println("Enter any two no :");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b= sc.nextInt();
            System.out.println("Additon is "+(a+b));
            System.out.println("Subtraction is "+(a-b));
            System.out.println("Multiplication is "+(a*b));
            System.out.println("Division is "+(a/b));
            System.out.println("Reminder is "+(a%b));
        }
    }


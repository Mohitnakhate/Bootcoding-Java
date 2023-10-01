package com.bootcoding.src.Method;

import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num= sc.nextInt();
        int f=getfactorial(num);
        System.out.println("Factorial of "+ num +" is "+f);

    }
    public static int getfactorial(int n)
    {
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        return fact;
    }
}


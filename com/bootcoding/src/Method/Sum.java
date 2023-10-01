package com.bootcoding.src.Method;

import java.util.Scanner;

//WAP to get sum of 1 to given number N using Method
public class Sum {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int s = getSum(num);
        System.out.println("sum of 1 to " + num + " is " + s);
    }

    public static int getSum(int n)
    {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}

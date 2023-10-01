package com.bootcoding.src.Method;

import java.util.Scanner;

public class cube {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int c = getCube(num);
        System.out.println("Cube of  " + num + " is " + c);
    }

    public static int getCube(int n)
    {
        int cube=0;
        if(n%2==0) {
            for (int i=2; i <= n; i++) {
                cube = cube + (i * i * i);

            }

        }
        return cube;
    }

}

package com.bootcoding.src.Array;
import java.util.Scanner;
public class Assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size/Length:");
        int n = scanner.nextInt();
        int nums[] = new int [n];
        for(int i = 0; i < n ; i++){
            System.out.println("Enter next Array Element:");
            int element = scanner.nextInt();
            nums[i]=element;
        }
        for (int i = 0; i < n; i++) {
            int cube=nums[i]*nums[i]*nums[i];

            System.out.println("Maximum Number of given array:" + cube);
        }
    }

}

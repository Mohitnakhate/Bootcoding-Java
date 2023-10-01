package com.bootcoding.src.Array;

public class Assign1 {
    public static void main(String[] args) {
        int nums[] = {500,10,2600,90,100};
        int max = 0;
        for (int i = 0; i <= 4; i++) {
            if (max < nums[i])
            {
                max = nums[i];
            }
        }
        System.out.println("Maximum Number of given array:" + max);
    }
}
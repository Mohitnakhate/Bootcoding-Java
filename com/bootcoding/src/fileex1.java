package com.bootcoding.src;//wap to reduce no n to zero by divding n by2 if n is even else substract by 1.


class fileex1
{
    public static void main(String[] args)
    {

        int n=30;
        while (n!=0)
        {
            if(n%2==0)
            {
                n=n/2;
                System.out.println(n);
            }
            else
            {
                n=n-1;
                System.out.println(n);
            }
        }
    }
}
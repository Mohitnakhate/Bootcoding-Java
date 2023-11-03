package Array;

public class array3 {
    public static void main(String[]args){
        int []arr={3,4,5,6,1,2};
        int max=0;
        int min=arr[0];

        //array maximun
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }

        //array minimum
        for (int i=0;i< arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }

        // print maximum and minimum
        System.out.println("Maximum No is:"+max);
        System.out.println("minimum no is:"+min);
    }
}

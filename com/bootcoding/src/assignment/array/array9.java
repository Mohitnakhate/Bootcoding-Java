package assignment.array;

public class array9 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 35, 75, 80, 95};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

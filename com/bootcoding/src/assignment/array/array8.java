//Que. Store following values into an array and print the maximum element of an array.
//[10, 15, 20, 25, 35, 75, 80, 95]
package assignment.array;
public class array8 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 35, 75, 80, 95};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

package assignment.array;

public class array4 {
    public static void main(String[]args){
        int even[] = {10,15,20,25,35,75,80,95};
        for (int i=0;i<8;i++){
            if (even[i]%2==0){
                System.out.print(even[i]+" ");
            }
        }
    }
}

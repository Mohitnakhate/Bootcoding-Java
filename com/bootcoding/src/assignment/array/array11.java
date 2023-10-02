package assignment.array;

public class array11 {
    public static void main(String[] args) {
        int[] swap = {10, 15, 20, 25, 35, 75, 80, 95};
        swap[2]=swap[2]+swap[5];
        swap[5]=swap[2]-swap[5];
        swap[2]=swap[2]-swap[5];
        for (int i=0;i<swap.length;i++){
            System.out.println(swap[i]);
        }
    }
}

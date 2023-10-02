package assignment.array;

public class array10 {
    public static void main(String[] args) {
        int[] swap = {10, 15, 20, 25, 35, 75, 80, 95};
        swap[0]=swap[0]+swap[7];
        swap[7]=swap[0]-swap[7];
        swap[0]=swap[0]-swap[7];
        for (int i=0;i<swap.length;i++){
            System.out.println(swap[i]);
        }
    }
}

// Store following values into an array and print “Found” if 80 exists.
//[10, 15, 20, 25, 35, 75, 80, 95]

package assignment.array;
public class array6 {
    public static void main(String[]args){
    int exist[] = {10,15,20,25,35,75,80,95};
    for (int i=0;i<8;i++){
        if (exist[i]==80){
            System.out.println(exist[i]+" "+"Found");
        }
    }
}
}

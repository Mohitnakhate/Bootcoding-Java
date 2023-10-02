//Que. Store following values into an array and print values whose value is between 30-100.
//[10,15,20,25,35,75,80,95]

package assignment.array;
public class array7 {
    public static void main(String[] args) {
        int betn[] = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int i=0;i<betn.length;i++){
            if (betn[i]>30 && betn[i] <100){
                System.out.println(betn[i]);
            }

        }
    }
}

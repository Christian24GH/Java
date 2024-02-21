import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListVSArrayList {
    public static void main(String[]args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long startTime;
        long endTime;
        long elapseTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        startTime = System.nanoTime();

        //linkedList.get(5000);
        arrayList.get(5000);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapseTime + "n/s");

    }
}

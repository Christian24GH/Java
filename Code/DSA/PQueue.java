import java.util.*;
public class PQueue {
    public static void main(String[] args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(Collections.reverseOrder());
        String[] elements = {"Minecraft", "Terraria", "BorderLands", "Leauge Of Legends", "Counter Strike"};
        //String[]elements = {};
        for(String index : elements){
            priorityQueue.add(index);
        }
        
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        
        //System.out.println(priorityQueue);
    }
}

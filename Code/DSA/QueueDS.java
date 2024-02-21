import java.util.LinkedList;
import java.util.Queue;

public class QueueDS{
    /*
        Queue = First-In-First-Out

            add = enqueue, offer();
            delete = dequeue, poll()
            peek()
            size()
            search = contains()
    */
    static void spacer(int x){
        while(x != 3){
            System.out.println("\n");
            x++;
        }
    }
    public static void main(String[]args){
       
        Queue<String> queue = new LinkedList<String>();
        String[] elements = {"Minecraft", "Terraria", "BorderLands", "Leauge Of Legends", "Counter Strike"};
        String head, removeTop, addElement = "Clash of Clans";
        for(int i = 0; i < elements.length; i++){
            queue.add(elements[i]);
        }
        
        spacer(0);

        System.out.println("Original Queue: " + queue);
        System.out.println("Current Size: " + queue.size());
        removeTop = queue.poll();
        head = queue.peek();
        System.out.println("Deleted/Previous Head Element: " + removeTop);
        System.out.println("Current Size: " + queue.size());

        queue.add(addElement);
        System.out.println("Current Queue: " + queue);
        System.out.println("Current Head Element: " + head);
        
        
        System.out.println("Current Size: " + queue.size());
        spacer(0);
    }
}
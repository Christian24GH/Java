import java.util.LinkedList;
public class LinkedLists {
    /*
     *  addFirst()	Adds an item to the beginning of the list.	
        addLast()	Add an item to the end of the list	
        removeFirst()	Remove an item from the beginning of the list.	
        removeLast()	Remove an item from the end of the list	
        getFirst()	Get the item at the beginning of the list	
        getLast()	Get the item at the end of the list
        add(index, element) insert a new node

        can also use Queue Methods:
        offer()
        poll()
     */
    public static void main(String[]args){
        LinkedList<String> linkedList = new LinkedList<String>();
        String[] elements = {"Minecraft", "Terraria", "BorderLands", "Leauge Of Legends", "Counter Strike"};
        for(String i: elements){
            linkedList.add(i);
        }
        if(linkedList.isEmpty()){
            System.out.println("The linked list is empty");
        }else{
            String removed = linkedList.remove();

            linkedList.add(0, "Clash of Clans");
            linkedList.addLast("CSGO2");
            System.out.println("LinkedList Elements: "+linkedList);
            System.out.println("Removed Element: "+removed);
            System.out.println("Current Size: "+ linkedList.size());
        }
       
    }
}

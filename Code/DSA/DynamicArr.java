

public class DynamicArr {
    public static void main(String[]args){
        DynamicArray dynamicArray = new DynamicArray(5);
        
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("hotdog");
        dynamicArray.add("dog");
        dynamicArray.delete("hotdog");
        
        System.out.println("FOUND HOTDOG AT INDEX: "+dynamicArray.search("dog"));
        System.out.println(dynamicArray.printList());
        System.out.println("SIZE: " + dynamicArray.size);
        System.out.println("CAPACITY: " + dynamicArray.capacity);
        
        
    }
}

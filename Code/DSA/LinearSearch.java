public class LinearSearch {
    public static void main(String[]args){
        Object[] arr = {"HOTDOG", 1, 2, "King"};
        int index = linearSearch(arr, "2");
        
        if(index == -1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at index: " + index);
        }
    }
    static int linearSearch(Object[] arr, Object value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}

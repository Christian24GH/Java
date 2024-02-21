//import java.util.Arrays;
public class BinarySearcher {
    public static void main(String[]args){
        Object[] arr = new Object[10000];
        int target = 51;

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        //int index = Arrays.binarySearch(arr, target);
        int index = binarySearch(arr, target);
        if(index == -1 || index < -1){
            System.out.println(target + " not found at current list");
        }else{
            System.out.println(target + " found at index: " + index);
        }
    }
    public static int binarySearch(Object[] ARRAY,int TARGET){
        int min = 0
        , max = ARRAY.length - 1;
        while(min <= max){
            int middle = min + (max - min) /2;
            Object value = ARRAY[middle];
            System.out.println("VALUE: " + value);
            if(middle < TARGET) min = middle + 1;
            else if(middle > TARGET) max = middle - 1;
            else return middle;
        }
        return -1;
    }
}

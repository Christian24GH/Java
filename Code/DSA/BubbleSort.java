public class BubbleSort {
    public static void main(String[] args){
        int[] ARRAY = {9, 2, 10, 8, 4, 6, 5, 7, 3, 1};
        System.out.println("Original Array: "+ printArr(ARRAY));
        int[] sortedArr = bubbleSort(ARRAY);
        System.out.println("Sorted Array: "+ printArr(sortedArr));
       
    }
    private static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static String printArr(int[] ARRAY){
        String str = "";
        for(int i = 0; i < ARRAY.length; i++){
            str += ARRAY[i] + ", ";
        }
        if(str != ""){
            str = "[" + str.substring(0, str.length() - 2) + "]";
        }else{
            return str = "[]";
        }
        return str;
    }
}

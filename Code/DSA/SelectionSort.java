public class SelectionSort {
    public static void main(String[]args){
        int[] ARRAY = {9, 2, 10, 8, 4, 6, 5, 7, 3, 1};

        System.out.println("Original Array: "+ printArr(ARRAY));
        int[] sortedArr = selectionSort(ARRAY);
        System.out.println("Sorted Array: "+ printArr(sortedArr));
    }
    private static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] < arr[j]){
                    min = j; //take their index
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

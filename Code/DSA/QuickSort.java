public class QuickSort {
    public static void main(String[]args){
        int[] ARRAY = {9, 2, 10, 8, 4, 6, 5, 7, 3, 1};

        System.out.println("Original Array: "+ printArr(ARRAY));
        quickSort(ARRAY, 0, ARRAY.length - 1);
        System.out.println("Sorted Array: "+ printArr(ARRAY));
    }
    private static void quickSort(int[] arr, int start, int end){
        if(end <= start) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        
        return i;
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

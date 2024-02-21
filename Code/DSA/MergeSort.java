public class MergeSort {
    public static void main(String[]args){
        int[] ARRAY = {9, 2, 10, 8, 4, 6, 5, 7, 3, 1};

        System.out.println("Original Array: "+ printArr(ARRAY));
        mergeSort(ARRAY);
        System.out.println("Sorted Array: "+ printArr(ARRAY));
    }
    private static void mergeSort(int[] arr){
        int length = arr.length;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0;
        int j = 0;
        if(length <= 1) return;

        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = arr[i];
            }else{
                rightArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
        //return arr;
    }
    private static void merge(int[] leftArray, int[]rightArray, int[]arr){
        int leftLength = arr.length / 2;
        int rightLength = arr.length - leftLength;
        int i = 0, l = 0, r = 0;

        while(l < leftLength && r < rightLength){
            if(leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftLength){
            arr[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightLength){
            arr[i] = rightArray[r];
            i++;
            r++;
        }
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

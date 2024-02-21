public class InsertionSearch {
    public static void main(String[]args){
        int[] ARRAY = {9, 2, 10, 8, 4, 6, 5, 7, 3, 30};

        System.out.println("Original Array: "+ printArr(ARRAY));
        int[] sortedArr = insertionSearchSort(ARRAY);
        System.out.println("Sorted Array: "+ printArr(sortedArr));
    }
    private static int[] insertionSearchSort(int[] arr){
        //START AT THE LEFT AT INDEX 1
        //STORE CURRENT ELEMENT AS TEMP
        //STORE AND GET THE INDEX - 1
        //WHILE J IS GREATER OR EQUAL TO 0, AND THE BEFORE ELEMENT IS GREATER THAN CURRENT ELEMENT
            // SET THE NEXT OF BEFORE ELEMENT AS BEFORE ELEMENT
            // REDUCE THE INDEX OF J
        //SET THE NEXT OF BEFORE ELEMENT AS THE CURRENT ELEMENT;
        
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
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

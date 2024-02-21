public class searching {
    public static int searchFunc(String[] arr, String key){
        int sub = -1;
        for(int i = 0; i < arr.length ; i++ ){
            if(key.compareTo(arr[i]) == 0){
                sub = i;
            }
        }
        return sub;
    }
    public static void main(String[] args){
        String key = "orange";
        String[] arr = {"apple", "orange", 
    "grape", "mango", "pineapple"};
        int arrFoundIndex = searchFunc(arr, key);
        if(arrFoundIndex == -1){
            System.err.println("Didn't find key:" + key + "...");
        }else{
            System.out.println("Index \"" + key + "\" found at Index " + arrFoundIndex + " ...");

        }
    }
}
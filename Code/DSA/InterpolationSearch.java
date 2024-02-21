public class InterpolationSearch {
    public static void main(String[]args){
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        int index = interpolationSearch(arr, 2);
        if(index != -1){
            System.out.println("Target found at index: " + index);
        }else{
            System.out.println("TARGET NOT FOUND!");
        }
    }
    private static int interpolationSearch(int[] array, int target){
        int high = array.length - 1,
            low = 0;
        
        while(target >= array[low] && target <= array[high] && low <= high){
            int probe = low + (high - low) * (target - array[low]) /
                        (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if(array[probe] == target){
                return probe;
            }else if(array[probe] < target){
                //if probe is less than the target
                // 8 < 10
                // set the lower boundary to 9;
                low = probe + 1;
            }else{
                high = probe - 1;
            }
        }
        return -1;
    }
}

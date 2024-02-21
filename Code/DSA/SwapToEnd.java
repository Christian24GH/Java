public class SwapToEnd {
    public static void main(String[]args){
        Object[] ARRAY = new Object[10];
        for(int i = 0; i < ARRAY.length; i++){
            ARRAY[i] = (Object) i;
        }
        ARRAY[0] = 10;
        for(int i = 0; i < ARRAY.length - 1; i++){ 
            for(int j = i; j < ARRAY.length; i++){
                Object temp = ARRAY[i];
                ARRAY[i] = ARRAY[i + 1];
                ARRAY[i + 1] = temp;
            }
            
        }
        
        for(Object i : ARRAY){
            System.out.println(i);
        }
    }
}

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    DynamicArray(){
        this.array = new Object[this.capacity];
    }
    DynamicArray(int capacity){
       this.capacity = capacity;
       this.array = new Object[capacity];
    }
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data; //targets the end of the list
        size++;
    }
    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public void delete(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                for(int j = 0; j < (size - i -1); j++ ){
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size == (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    public void grow(){
        int newCapacity = (int)(capacity*2);
        Object[] temp = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            temp[i] = array[i];
        }
        capacity = newCapacity;
        array = temp;
    }
    public void shrink(){
        int newCapacity = (int)(capacity/2);
        Object[] temp = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            temp[i] = array[i];
        }
        capacity = newCapacity;
        array = temp;
    }
    public String printList(){
        String str = "";
        for(int i = 0; i < size; i++){
            str += array[i] + ", ";
        }
        if(str != ""){
            str = "[" + str.substring(0, str.length() - 2) + "]";
        }else{
            str = "[]";
        }
        return str;
    }
}


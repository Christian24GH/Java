public class class2 {
    
    String _name;
    static int numOfFriends = 0;

    class2(String name){
        this._name = name;
        numOfFriends++;
    };
    static void display(){
        System.out.println("Number of Friends = " + numOfFriends);
    }
    void displayName(){
        System.out.println(_name);
    }
}

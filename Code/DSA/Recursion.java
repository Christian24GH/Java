public class Recursion {
    public static void main(String[]args){
        //walk(5);
        //System.out.println("FACTORIAL RESULT IS "+ factorial(7));
        int base = 2;
        System.out.println("POWER OF "+base +" is "+power(base, 8));
    }
    private static int power(int base, int exponent){
        if(exponent < 1)return 1;
        return base * power(base, exponent - 1) ;
    }
    /*
    private static int factorial(int num){
       if(num == 0) return 1;
       return num * factorial(num - 1); 
    }
     */
    /*
    private static void walk(int num){
        if(num == 0)return;
        
        System.out.println("You walked " + num +" times!");
        walk( num - 1);
    }
     */
    
}

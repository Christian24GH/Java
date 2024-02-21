public class Calc {
    static int addUp(int n){
        int sum = n * (n + 1) / 2;
        return sum;
    }
    static int addUpFor(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(addUp(5));
        System.out.println(addUpFor(5));
    }
}

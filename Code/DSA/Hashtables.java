import java.util.*;
public class Hashtables{
    public static void main(String[]args){
        Hashtable<String, String> table = new Hashtable<>(50);

        table.put( "100", "Spongebob");
        table.put( "123", "Patrick");
        table.put( "321", "Sandy");
        table.put( "555", "Squidward");
        table.put( "777", "Gary");

        //table.remove("100");
        for(String key : table.keySet()){
            System.out.println(key.hashCode()%50+"\t"+key +"\t"+table.get(key));
        }
    }
}
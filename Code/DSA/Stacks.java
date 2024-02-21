import java.util.Stack;
public class Stacks {
    public static void main(String[] args){
        Stack<String> videoGames = new Stack<>();

        String[]videoGameArr = {"Minecraft", "Terraria", "BorderLands", "Leauge Of Legends", "Counter Strike"};
        
        for(String i : videoGameArr){
            videoGames.push(i);
        }
        
        String currentTop = videoGames.peek();
        System.out.println(currentTop);
        System.out.println(videoGames);
        
        String deleteTop = videoGames.pop();
        deleteTop = videoGames.pop();
        System.out.println("Deleted Top ELEMENT: " + deleteTop);
        String isItEmpty = (videoGames.empty()) ? "EMPTY" : "Not empty";
        System.out.println(isItEmpty);
    }
}

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Game {

    private Player player;
    private List<Player> players = new ArrayList<>();
    private Random dice = new Random();

    public void addPlayer(Player player){
        if (nameExists(player)){
            players.add(player);
        }
else{
player.setName(player.getName() + dice.nextInt(10));
addPlayer(player);
}
    }

    private void nameExists(String name) {
        for (Player player : players){
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
}

    public void removePlayer(String name) {

//for (int i=0; i<players.size(); ++i){
//if (players.get(i).getName().equals(name)){
//players.remove(i);
//}
//}

//for (Iterator<Player> it = players.iterator();
//it.hasNext();) {
//if (it.next().getName().equals(name)) {
//it.remove();
//break;
//}
//} 

       players.removeIf((Player player) -> player.getName().equals(name));

}



    public void printPlayers() {
       System.out.println("---------------------");
       players.forEach(player ->
               System.out.println(player.getName()));
}

    public void play() {

        int number;
        int guess;

        boolean repeat = true;
        do {
            System.out.println("---------------------");

            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);

            for (Player player : players){
            guess = dice.nextInt(6) + 1;
            System.out.println(player.getName() + ": " + guess);

            if (number == guess) {
                System.out.println("Brawo!");
                repeat = false;
            } else {
                System.out.println("Zle!");
            }
            }
        } while (repeat);
    }
}

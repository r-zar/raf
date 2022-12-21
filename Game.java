public class Game {

import java.util.ArrayList;
import java.util.List; 
import java.util.Random;

public class Game {

    private Statistics statistics = new NullStatistics();
    private Random dice = new Random();
    private List<Player> players = new Arraylist<>();
    
    public Game(Statistics statistics) {
        if (statistics != null)
            this.statistics = statistics;
}

    public void addPlayer(Player player) {
        if (nameExists(player.getName())) {
            player.setName(player.getName() + dice.nextInt(10));
            addPlayer(player);
}
        else players.add(player);
}

    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
            return
}
}
}


if (guess == number) {
    System.out.println("Brawo!");
    if (statistics != null)
        statistics.winner(player);
        repeat
}







public void printStatistics()
}
}

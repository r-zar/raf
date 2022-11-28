package KOLOKWIUM_PROBNEV2;

import java.util.Random;

public class Game {

    private Player player;

    public void addPlayer(Player player){
        this.player = player;
    }

    public void play() {

        Random dice = new Random();

        Player player = new PlayerComp("Ziutek");

        int number;
        int guess;
        do {
            System.out.println("---------------------");

            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);

            guess = dice.nextInt(6) + 1;
            System.out.println(player.getName() + ": " + guess);

            if (number == guess) {
                System.out.println("Brawo!");
            } else {
                System.out.println("Zle!");
            }
        } while (number != guess);
    }
}

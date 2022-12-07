public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        for (int i=0; i<10; ++i)
        game.addPlayer(new PlayerComp("Stefan"));
        game.addPlayer(new PlayerComp("Ziutek"));
        game.printPlayers();
        game.removePlayer("Zocha");
        game.printPlayers();
        
        game.play();
    }
}







// int a; deklarujemy zmienna a typu int
// int to typ danych/ 32 bity
// zakres wartosci na bajcie

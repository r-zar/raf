package KOLOKWIUM_PROBNEV2;

import java.util.Random;

abstract public class Player {
     Random brain = new Random();

    private String name = "Anonim";

    public Player() {
    }

    public Player(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9~.]{3,}$")) {  //!name.matches("^[a-zA-Z0-9.\\-_]{3,}$")
            this.name = name;
        } else {
            throw new IllegalArgumentException("Niepoprawne imie!");
        }
    }

    public int guess() {
        return brain.nextInt(6) + 1;
    }
}

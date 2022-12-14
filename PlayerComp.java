public class PlayerComp extends Player {
    public PlayerComp(){
    }
    public PlayerComp(String name) {
        setName(name);
    }
    @Override
    public int guess() {
        return brain.nextInt(6) + 1;
    }

}


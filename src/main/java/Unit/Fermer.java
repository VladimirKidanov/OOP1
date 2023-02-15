package Unit;

public class Fermer extends Character {

    int feed;
    int cartridges;

    public Fermer(String name, int hp, int attack) {
        super(name, hp, attack);

    }
    public int getCartridges() {
        return 10;
    }
    public int getFeed() {
        return 0;
    }

}

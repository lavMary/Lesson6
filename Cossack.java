public class Cossack extends Warrior {
    Saber saber;
    public Cossack(int hp, int level, int damage) {
        super(hp, level, damage);
    }

    @Override
    void heroInfo() {
        System.out.println("Hi! My name is Ivan and I like pierogi.");
    }
}

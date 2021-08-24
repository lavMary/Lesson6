public class HealerDruid extends Healer{
    Beast beast;
    public HealerDruid (int hp, int level, int damage) {
        super(hp, level, damage);
    }


    void tameBeast() {
        System.out.println("The beast is tamed.");
    }

    @Override
    void heroInfo() {
        System.out.println("Hi! My name is Ella.");
    }
}

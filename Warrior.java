public class Warrior extends Hero {
    int phisDamageMultipl;

    public Warrior (int hp, int level, int damage) {
        super(hp, level, damage);
    }

    void powerfulHit() {
        hp -= 100;
        System.out.println("- " + hp + ". It was powerful!");
    }
}

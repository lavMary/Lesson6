public class Healer extends Hero {
    int healPower;

    public Healer(int hp, int level, int damage) {
        super(hp,level,damage);
    }

    void heal() {
        System.out.println("It`s ok. I`m healing!");
    }
    
}

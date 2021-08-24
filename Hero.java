public class Hero {
    int hp;
    int level;
    private int damage;

    public Hero(int hp, int level, int damage) {
        this.hp = hp;
        this.level = level;
        this.damage = damage;
    }
    public int getdamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    void heroInfo() {
        System.out.println("Hi! My name is Super Ultra Man");
    }


}

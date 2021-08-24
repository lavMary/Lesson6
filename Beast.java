public class Beast {
    int hp;
    int damage;
    String name;

    public Beast(int hp, int damage, String name) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
    }
    final void beastAttack() {
        System.out.println("I attack like a beast.");
    }
}

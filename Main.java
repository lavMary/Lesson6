public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(3000, 99, 1400);
        Healer healer = new Healer(1750, 72, 100);
        Warrior warrior = new Warrior(1200, 70, 150);
        Beast beast = new Beast(100, 105, "Bubble");
        HealerDruid healerDruid = new HealerDruid(1900, 75,135);
        Sword sword = new Sword();
        Saber saber = new Saber();
        Cossack cossack = new Cossack(9999, 999, 10000);
    }

}

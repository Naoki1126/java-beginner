package classLesson10;

public class PoisonMatango extends Matango {
    private int poisonAttackCount = 5;
    public PoisonMatango(char ch){
        super(ch);
    }

    public void attack(Hero h){
        super.attack(h);

        if (this.poisonAttackCount == 0){
            return;
        }

        System.out.println("さらに毒の胞子をばらまいた。");

        int damage = h.getHp() / 5;
        h.setHp(h.getHp() - damage);
        System.out.println(damage +  "ポイントのダメージ");


        this.poisonAttackCount -= 1;

    }
}

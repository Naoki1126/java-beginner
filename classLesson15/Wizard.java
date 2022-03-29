package classLesson15;

import classLesson15.Matango;

public class Wizard extends Character {
    int mp;

    public void attack(Monster m){
        System.out.println(this.getName() + "の攻撃");
        System.out.println("敵に3ポイントのダメージ");
        m.setHp(m.getHp() - 3);
    }

    public void fireball(Matango m){
        System.out.println(this.getName() + "は火の玉を放った");
        System.out.println("敵に20ポイントのダメージ");
        m.hp -= 20;
        this.mp -= 5;
    }
}

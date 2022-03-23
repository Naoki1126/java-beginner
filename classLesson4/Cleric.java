import java.util.*;

public class Cleric{
    String name;
    int hp = 50;
    static int MAXHP = 50;
    int mp = 10;
    static int MAXMP = 10;

    Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp){
        // this.name = name;
        // this.hp = hp;
        // this.mp = Cleric.MAXMP;
        this(name, hp, Cleric.MAXMP)
    }

    Cleric(String name){
        // this.name = name;
        // this.hp = Cleric.MAXHP;
        // this.mp = Cleric.MAXMP;
        this(name, Cleric.MAXHP, Cleric.MAXMP);
    }

    void selfAid(){
        this.mp -= 5;
        this.hp = this.MAXHP;
    }

    int pray(int praySecond){
        int recoverlyPoint = new Random().nextInt(3) + praySecond;
        int diff;
        if ((recoverlyPoint + this.mp) > this.MAXMP){
            this.mp = this.MAXMP;
            diff = this.MAXMP - recoverlyPoint;
        }else{
            diff = recoverlyPoint;
        }

        return diff;
    }
}
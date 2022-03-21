import java.util.*;

public class Cleric{
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

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
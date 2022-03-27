package classLesson12;

public abstract class Character extends BattleCreature {
    String name;
    int hp;

    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }

    public abstract void attack(Matango m);
}

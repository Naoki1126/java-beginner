package classLesson9;

public class Hero {
    private String name = "Minato";
    private int hp = 100;

    public Hero(){
        System.out.println("Heroのコンストラクタが動作");
    }

    public void attack(Matango m){
        System.out.println(this.name + "の攻撃!");
        m.hp -= 100;
        System.out.println("5ポイントのダメージを与えた");
    }

    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }

    public final void slip(){
        this.hp -= 5;
        System.out.println(this.getName() + "は転んだ");
    }

    public String getName(){
        return this.name;
    }
}

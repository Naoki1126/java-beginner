public class Hero {
    String name;
    int hp;
    static int money;

    Hero(String name){
        this.hp = 100;
        this.name = name;
    }

    // Hero(){
    //     this.hp = 100;
    //     this.name = "dammy";
    // }

    Hero(){
        this("dammy");
    }

    static void setRandomMoney(){
        Hero.money = (int) (Math.random() * 1000);
    }
}

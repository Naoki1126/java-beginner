package classLesson15;

public abstract class Monster {
    int hp;
    String name;
    public void run(){
        System.out.println("Monster is run");
    }

    public int getHp(){ return this.hp; }
    public void setHp(int hp){ this.hp = hp; }
    public String getName(){ return this.name;}
    public void setName(String name){ this.name = name;}
}

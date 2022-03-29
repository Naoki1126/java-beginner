package classLesson15;

public abstract class Character {
    private String name;
    private int hp;
    public abstract void attack(Monster m);
    public void run(){
        System.out.println("run");
    }

    public String getName(){ return this.name; }
    public void setName(String name) { this.name = name; }

    public int getHp() { return this.hp;}
    public void setHp(int hp){ this.hp = hp; }
}

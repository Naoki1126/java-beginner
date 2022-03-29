package classLesson15;

public class Main {
    public static void main(String[] args){
        Wizard w =  new Wizard();
        // Character c = w;
        
        Character c2 = new Wizard();
        if (c2 instanceof Wizard){
            Wizard w2 = (Wizard)c2;
        }

        // Matango m = new Matango();

        // c.name = "Asaka";
        // c.attack(m);
        // c.run()

        Slime s = new Slime();
        Monster m = new Slime();

        s.run();
        m.run();

        Character[] c = new Character[5];
        c[0] = new Hero();
        c[1] = new Hero();
        c[2] = new Thief();
        c[3] = new Wizard();
        c[4] = new Wizard();

        for (Character ch : c){
            ch.setHp(ch.getHp() + 50);
        }

        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
        monsters[1] = new Goblin();
        monsters[2] = new DeathBat();

        for ( Monster m2 : monsters ){
            m2.run();
        }
    }
}

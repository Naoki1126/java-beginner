public class Main {
    public static void main(String[] args){
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 100;
        Hero h = new Hero();
        h.name = "Minato";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);

        Hero h2 = new Hero();
        h2.name = "Asaka";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "Sugawara";
        w.heal(h);
        w.heal(h2);
        w.heal(h2);
    }
}

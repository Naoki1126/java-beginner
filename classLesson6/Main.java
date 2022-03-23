public class Main{

    public static void main(String[] args){
        Hero h1 = new Hero("Minato");

        System.out.println(h1.name);
        Hero h2= new Hero();

        System.out.println(h2.name);
        System.out.println(Hero.money);
        Hero.setRandomMoney();
        System.out.println(h1.money);

        System.out.println(h2.money);
    }

}
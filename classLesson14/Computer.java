package classLesson14;

public class Computer extends TangibleAsset {
    private String color;
    private String makerName;

    public Computer(String name, int price, String color, String makerName){
        super(name, price, color);
        this.makerName = makerName;
    }
    public String getMakerName() { return this.makerName; }
}
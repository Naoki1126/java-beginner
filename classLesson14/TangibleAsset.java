package classLesson14;

public abstract class TangibleAsset extends Asset implements Thing {
    
    private String color;
    private double weight;

    public String getColor(){ return this.color; }

    TangibleAsset(String name, int price, String color){
        super(name, price);
        this.color = color;
    }

    public double getWeight(){ return this.weight;}

    public void setWeight(double weight){
        this.weight = weight;
    }
}

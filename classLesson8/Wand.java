package classLesson8;

public class Wand {
    private String name;
    private double power;

    public  String getName(){

        return this.name;
    }

    public void setName(String name){
        if (this.name == null){
            throw new IllegalArgumentException("名前がnullです。処理を中断");
        }

        if (this.name.length() < 3){
            throw new IllegalArgumentException("名前が3文字未満。処理を中断");
        }

        this.name = name;
    }

    public double getPower(){
        return this.power;
    }

    public void setPower(double power){
        if (power < 0.5){
            throw new IllegalArgumentException("魔力増幅0.5が未満。処理を中断");
        }

        if (power > 100.0){
            throw new IllegalArgumentException("魔力増幅が100より上。処理を中断");
        }
        this.power = power;
    }
}

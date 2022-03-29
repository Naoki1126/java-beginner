package classLesson16;

public class Main {
    public static void main(String[] args){
        X obj = new A();
        obj.a();
       
        Y y1 = new A();
        Y y2 = new B();

        y1.a();
        y1.b();
        
        y2.a();
        y2.b();

        Y[] ys = new Y[2];
        ys[0] = new A();
        ys[1] = new B();

        for( Y y : ys){
            y.b();
        }
    }
}

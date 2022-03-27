package classLesson13;


public class KyotoCleaningShop implements CleaningService {
    private String ownerName;
    private String address;
    private String phone;

    public Shirt washShirt(Shirt s){
        return s;
    }

    public Towl washTowl(Towl t){
        return t;
    }

    public Coat washCoat(Coat c){
        return c;
    }
}

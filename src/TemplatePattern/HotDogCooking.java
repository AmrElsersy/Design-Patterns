package TemplatePattern;

public class HotDogCooking extends FoodCooking {
    public void cookFood()
    {
        System.out.println("Hot Dog !");
    }

    @Override
    public void addSoce() {
        System.out.println("add special hotdog soce");
    }

    HotDogCooking(boolean x) {super(x);}

}

package TemplatePattern;

public class ChickenCooking extends FoodCooking {
    public void cookFood()
    {
        System.out.println("Chicken !");
    }

    @Override
    public void addSoce() {
        System.out.println("add Katchap");
    }

    ChickenCooking(boolean x) {super(x);}

}

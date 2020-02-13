package TemplatePattern;

public class Resturant {
    public static void main(String args[])
    {
        FoodCooking sandwitch1 = new HotDogCooking(false);
        FoodCooking sandwitch2 = new HotDogCooking(true);

        sandwitch1.cook();
        sandwitch2.cook();

        System.out.println("...............");

        FoodCooking chicked_sandwitch1 = new ChickenCooking(false);
        FoodCooking chicked_sandwitch2 = new ChickenCooking(true);

        chicked_sandwitch1.cook();
        chicked_sandwitch2.cook();
    }

}

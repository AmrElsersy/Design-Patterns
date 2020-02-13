package Decorator;

public class Milk extends AdditionDecorator {

    Milk(Drink d) {super(d);}
    public int getCost() { return this.drinkDecorated.getCost() + 50;}
    public String getDescription() {return "MOCHA"; }}

package Decorator;

public class Mocha  extends AdditionDecorator{

    Mocha(Drink d) {super(d);}
    public int getCost() { return this.drinkDecorated.getCost() + 5;}
    public String getDescription() {return "MOCHA"; }
}

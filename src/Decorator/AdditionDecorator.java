package Decorator;

abstract class AdditionDecorator extends Drink
{
    AdditionDecorator(Drink d) {super(0); this.drinkDecorated = d;}
    protected Drink drinkDecorated;
}

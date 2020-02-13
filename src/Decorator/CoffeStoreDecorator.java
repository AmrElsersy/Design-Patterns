package Decorator;

public class CoffeStoreDecorator {
    public static void main(String args[])
    {
        Drink ex = new Expresso(100);
        Drink hot = new HotChoc(200);

        AdditionDecorator ex_decorator = new Mocha(ex);
        ex_decorator = new Mocha(ex_decorator);

        AdditionDecorator hot_decorator = new Milk(hot);
        hot_decorator = new Mocha(hot_decorator);

        System.out.println("ex:"+ ex_decorator.getCost());
        System.out.println("hot:"+ hot_decorator.getCost());

    }

}

package StrategyPattern_Payment;

public class Coffe_Store {
    public static void main(String args[])
    {
        Drink hot = new HotChoc(200);
        hot.addAddition(new Milk());
        hot.addAddition(new Mocha());
        hot.addAddition(new Mocha());
        hot.getDescription();
        System.out.println("Price="+ hot.getCost());

        Drink ex = new Expresso(100);
        ex.addAddition(new Mocha());
        ex.getDescription();
        System.out.println("Price="+ ex.getCost());



    }
}

package StrategyPattern_Payment;

import java.util.ArrayList;

abstract class Drink {
    private ArrayList<Addition> additions = new ArrayList<Addition>();
    private int cost;
    Drink(int Cost) {this.cost = Cost;}
    abstract String getDescription();
    public int getCost()
    {
        int total = this.cost;
        for (Addition addition : additions)
        {
            total += addition.getCost();
        }
        return  total;
    }
    public void addAddition(Addition addition) { this.additions.add(addition); }
}

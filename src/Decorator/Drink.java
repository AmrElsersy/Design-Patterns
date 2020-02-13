package Decorator;

import java.util.ArrayList;

abstract class Drink {
    private int cost;
    Drink(int Cost) {this.cost = Cost;}
    public int getCost() { return  this.cost; }
    abstract String getDescription();
}

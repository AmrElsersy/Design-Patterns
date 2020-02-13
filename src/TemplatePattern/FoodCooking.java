package TemplatePattern;

abstract class FoodCooking {
    public final void cook() // final prevent the subclasses to override this function
    {
        cookBread();
        cookFood();
        if(this.Soce) // the concrete class can add to the algorithm but the abstract class still control the sequence and determine that the subclass will modify or not
            addSoce();
        getSandwitchPrice();
        System.out.println();
    }
    abstract void cookFood(); // make the concrete class implement to determine the food
    public void addSoce() // for adding katchp maionis .. etc
    {
        //do nothing ... hook method it is an optional for user to add to the algorithm sequence.
    }

    public void cookBread()
    {
        System.out.println("Bread is cooked");
    }
    public void getSandwitchPrice()
    {
        System.out.println("Please pay the sandwitch");
    }
    private boolean Soce;
    FoodCooking(boolean soce)
    {
        this.Soce = soce;
    }
}

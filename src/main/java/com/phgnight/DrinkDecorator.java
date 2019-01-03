package com.phgnight;

public abstract class DrinkDecorator implements Drink{
    Drink drink;
    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }

    public double getPrice(){return getPrice();}
    public String getDescription(){return drink.getDescription();}

}

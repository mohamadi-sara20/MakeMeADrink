package com.phgnight;

public abstract class DrinkDecorator implements Drink{
    Drink drink;
    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }

    public int getPrice(){return drink.getPrice();}
    public String getDescription(){return drink.getDescription();}

}

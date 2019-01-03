package com.phgnight;

public class FruitNectar extends DrinkDecorator{
    public FruitNectar(Drink drink){
        super(drink);
    }
    public int getPrice(){return super.getPrice() + 2000;}
    public String getDescription(){return super.getDescription() + ", Fruit Nectar";}
}

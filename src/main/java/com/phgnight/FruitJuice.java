package com.phgnight;

public class FruitJuice extends DrinkDecorator{
    public FruitJuice(Drink drink){
        super(drink);
    }

    public int getPrice(){return super.getPrice() + 2000;}
    public String getDecription(){return super.getDescription() + ", Fruit Juice";}

}


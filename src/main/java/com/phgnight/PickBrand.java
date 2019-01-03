package com.phgnight;

public class PickBrand extends DrinkDecorator{
    public PickBrand(Drink drink){
        super(drink);
    }

    public double getPrice(){return super.getPrice() + 5000;}

}

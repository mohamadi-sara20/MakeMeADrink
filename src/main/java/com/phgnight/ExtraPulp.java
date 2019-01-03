package com.phgnight;

public class ExtraPulp extends DrinkDecorator{
    public ExtraPulp(Drink drink){
        super(drink);
    }

    public int getPrice(){return super.getPrice() + 3000;}
    public String getDescription(){return super.getDescription() + ", With Extra Pulp";}
}

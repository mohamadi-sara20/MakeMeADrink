package com.phgnight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPricing {
    private Drink myFavorite, dadsFavorite, sistersFavorite, momsFavorite, brosFavorite;
    private Drink breakfastDrink, lunchDrink, nightDrink, autumnDrink, summerDrink;

    @Before
    public void initialize(){
         myFavorite = new FruitNectar(new ExtraPulp(new Sunich(new Lemon(5000))));
         dadsFavorite = new FruitNectar(new ExtraPulp(new Orange(12000)));
         momsFavorite = new FruitJuice(new Lemon(7000));
         sistersFavorite = new FruitJuice(new SunStar(new Orange(7000)));
         brosFavorite = new FruitNectar(new ExtraPulp(new Sundis(new Orange(6000))));


         breakfastDrink = new ExtraPulp(new FruitNectar(new Sunich(new Lemon(5000))));
         lunchDrink = new ExtraPulp(new FruitNectar(new Orange(12000)));
         nightDrink = new SunStar(new FruitJuice(new Lemon(7000)));
         summerDrink = new FruitJuice(new Orange(7000));
         autumnDrink = new ExtraPulp(new Sundis(new FruitNectar(new Orange(6000))));





    }



    @Test
    public void testPrices(){
        Assert.assertTrue(myFavorite.getPrice() == breakfastDrink.getPrice() && myFavorite.getPrice() == 15000);
        Assert.assertTrue(dadsFavorite.getPrice() == lunchDrink.getPrice() && dadsFavorite.getPrice() == 17000);
        Assert.assertTrue(momsFavorite.getPrice() == summerDrink.getPrice() && momsFavorite.getPrice() == 9000);
        Assert.assertTrue(sistersFavorite.getPrice() == nightDrink.getPrice() && sistersFavorite.getPrice() == 12000);
        Assert.assertTrue(brosFavorite.getPrice() == autumnDrink.getPrice() && brosFavorite.getPrice() == 11500);


    }


}

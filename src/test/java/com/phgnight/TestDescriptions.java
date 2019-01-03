package com.phgnight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDescriptions {
    private Drink myFavorite, dadsFavorite, sistersFavorite, momsFavorite, brosFavorite;
    private Drink breakfastDrink, lunchDrink, nightDrink, autumnDrink, summerDrink;

    @Before
    public void initialize(){
        myFavorite = new FruitNectar(new ExtraPulp(new Sunich(new Lemon(5000))));
        dadsFavorite = new FruitNectar(new ExtraPulp(new Orange(12000)));
        momsFavorite = new FruitJuice(new Lemon(7000));
        sistersFavorite = new FruitJuice(new SunStar(new Orange(7000)));
        brosFavorite = new FruitNectar(new ExtraPulp(new Sundis(new Orange(6000))));


        breakfastDrink = new FruitNectar(new ExtraPulp(new Sunich(new Lemon(5000))));
        lunchDrink = new FruitNectar(new ExtraPulp(new Orange(12000)));
        nightDrink = new FruitJuice(new SunStar(new Orange(7000)));
        summerDrink = new FruitJuice(new Lemon(7000));
        autumnDrink = new FruitNectar(new ExtraPulp(new Sundis(new Orange(6000))));


    }


    @Test
    public void testDescriptions(){
        Assert.assertTrue(myFavorite.getDescription().equalsIgnoreCase(breakfastDrink.getDescription()));
        Assert.assertTrue(dadsFavorite.getDescription().equalsIgnoreCase(lunchDrink.getDescription()));
        Assert.assertTrue(momsFavorite.getDescription().equalsIgnoreCase(summerDrink.getDescription()));
        Assert.assertTrue(sistersFavorite.getDescription().equalsIgnoreCase(nightDrink.getDescription()));
        Assert.assertTrue(brosFavorite.getDescription().equalsIgnoreCase(autumnDrink.getDescription()));

    }


}

package com.pattern_factory.abstractfactory;

import com.pattern_factory.Clothes;
import com.pattern_factory.Shoe;
import com.pattern_factory.Sweater;
import com.pattern_factory.factory.PantFactory;
import com.pattern_factory.factory.ShoeFactory;
import com.pattern_factory.factory.SweaterFactory;

public class ClothFactory extends AbstractFactory {
    @Override
    public Clothes getSweater() {
        return new SweaterFactory().getClothes();
    }

    @Override
    public Clothes getPant() {
        return new PantFactory().getClothes();
    }

    @Override
    public Clothes getShoe() {
        return new ShoeFactory().getClothes();
    }
}

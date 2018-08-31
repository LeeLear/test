package com.pattern_factory.factory;

import com.pattern_factory.Clothes;
import com.pattern_factory.Pant;

public class PantFactory implements Factory{
    @Override
    public Clothes getClothes() {
        return new Pant();
    }
}

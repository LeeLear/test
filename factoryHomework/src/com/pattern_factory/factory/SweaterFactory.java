package com.pattern_factory.factory;

import com.pattern_factory.Clothes;
import com.pattern_factory.Sweater;

public class SweaterFactory implements Factory{
    @Override
    public Clothes getClothes() {
        return new Sweater();
    }
}

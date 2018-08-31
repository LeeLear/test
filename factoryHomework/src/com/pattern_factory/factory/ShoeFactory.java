package com.pattern_factory.factory;

import com.pattern_factory.Clothes;
import com.pattern_factory.Shoe;

public class ShoeFactory implements Factory {
    @Override
    public Clothes getClothes() {
        return new Shoe();
    }
}

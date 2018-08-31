package com.pattern_factory;

import com.pattern_factory.Clothes;

public class Sweater implements Clothes {
    @Override
    public String getName() {
        return "this is a sweater";
    }

    @Override
    public String getPrice() {
        return "98.00";
    }
}

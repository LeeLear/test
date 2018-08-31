package com.pattern_factory;

import com.pattern_factory.Clothes;

public class Shoe implements Clothes {
    @Override
    public String getName() {
        return "this is a pair of shoes";
    }

    @Override
    public String getPrice() {
        return "200.00";
    }
}

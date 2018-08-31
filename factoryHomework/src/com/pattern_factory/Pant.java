package com.pattern_factory;

import com.pattern_factory.Clothes;

public class Pant implements Clothes {


    @Override
    public String getName() {
        return "this is a pant";
    }

    @Override
    public String getPrice() {
        return "150.00";
    }
}

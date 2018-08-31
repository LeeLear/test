package com.pattern_factory.abstractfactory;

import com.pattern_factory.factory.Factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ClothFactory clothFactory = new ClothFactory();
        clothFactory.getPant();
    }
}

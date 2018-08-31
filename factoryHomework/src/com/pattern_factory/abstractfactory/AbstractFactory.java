package com.pattern_factory.abstractfactory;

import com.pattern_factory.Clothes;

public abstract class AbstractFactory {
    public abstract Clothes getSweater();

    public abstract Clothes getPant();

    public abstract Clothes getShoe();
}

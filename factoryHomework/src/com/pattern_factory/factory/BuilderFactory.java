package com.pattern_factory.factory;

import com.pattern_factory.Constant;

public class BuilderFactory {
    public Factory buildFactory(String name){
        Factory factory = null;
        if(name.equals(Constant.SHOE)){
            factory = new ShoeFactory();
        }else if(name.equals(Constant.SWEATER)){
            factory= new SweaterFactory();
        }else if(name.equals(Constant.PANT)){
            factory = new PantFactory();
        }
        return factory;
    }
}

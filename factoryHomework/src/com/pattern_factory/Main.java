package com.pattern_factory;


import com.pattern_factory.factory.BuilderFactory;
import com.pattern_factory.factory.Factory;
import com.pattern_factory.simple.SimpleFactory;

public class Main {
    public static void main(String[] args) {
       /* SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.buy(Constant.PANT);

        try {
            simpleFactory.buyByClassName(Constant.SHOENAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }*/

        BuilderFactory builderFactory = new BuilderFactory();
        Clothes clothes =builderFactory.buildFactory(Constant.PANT).getClothes();
        System.out.println(clothes.getName());
        System.out.println(clothes.getPrice());
    }
}

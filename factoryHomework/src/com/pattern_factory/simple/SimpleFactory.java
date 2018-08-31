package com.pattern_factory.simple;

import com.pattern_factory.*;

public class SimpleFactory {
    public void buy(String name){
        Clothes clothes=null;
        if(name.equals(Constant.PANT)){
            clothes= new Pant();
        }else if(name.equals(Constant.SWEATER)){
            clothes = new Sweater();
        }else if(name.equals(Constant.SHOE)){
            clothes = new Shoe();
        }
        System.out.println(clothes.getName());
        System.out.println("You should pay it for "+clothes.getPrice()+" yuan");
    }
    public void buyByClassName(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Clothes clothes =(Clothes)Class.forName(name).newInstance();
        System.out.println(clothes.getName());
        System.out.println("You should pay it for "+clothes.getPrice()+" yuan");
    }
}

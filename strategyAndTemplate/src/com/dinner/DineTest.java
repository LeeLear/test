package com.dinner;

import com.dinner.purchaseType.FoodType;

import java.util.Date;

public class DineTest {
    public static void main(String[] args) {
        Dine dine = new Dine();
       String[] food = {"盖浇饭","牛肉"};

       dine.dining(new Date(),"home",food,FoodType.RESTAURANT,48);
    }
}

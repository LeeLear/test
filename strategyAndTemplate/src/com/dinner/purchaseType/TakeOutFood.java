package com.dinner.purchaseType;

import com.dinner.ChooseResult;

public class TakeOutFood implements Purchase{
    @Override
    public ChooseResult purchase(String timeAmount, String[] food, double money) {
        System.out.println("懒的要死，吃外卖，走两步不行啊");
        System.out.println("忙啊，只能花小钱买别人的时间了");
        return new ChooseResult("TakeOutFood",timeAmount,money,food);
    }
}

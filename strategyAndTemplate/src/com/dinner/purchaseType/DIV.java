package com.dinner.purchaseType;

import com.dinner.ChooseResult;

import java.util.Date;

public class DIV implements Purchase{
    @Override
    public ChooseResult purchase(String timeAmount, String[] food, double money) {
        System.out.println("有品位，居然自己做饭，不怕黑暗料理啊");
        System.out.println("穷啊，只能时间换钱了");
        return new ChooseResult("DIV",timeAmount,money,food);
    }
}

package com.dinner.purchaseType;

import com.dinner.ChooseResult;

public class Restaurant implements Purchase{
    @Override
    public ChooseResult purchase(String timeAmount, String[] food, double money) {
        StringBuffer sb = new StringBuffer();
        for (String s:food) {
            sb.append(s+" ");
        }
        System.out.println("看看你点的菜:"+sb.toString());
        if(money<50) {
            System.out.println("下个馆子也不知道对自己好点");
        }else {
            System.out.println("别浪费了哦");
        }
        return new ChooseResult("Resturant",timeAmount,money,food);
    }
}

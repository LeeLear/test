package com.dinner;

import java.util.Arrays;

public class ChooseResult {
    private String way;
    private String timeAmount;

    private double money;
    private String[] food;

    public ChooseResult(String way,String timeAmount, double money, String[] food) {
        this.timeAmount=timeAmount;
        this.way = way;
        this.money = money;
        this.food = food;
    }

    @Override
    public String toString() {
        return "您选择的方式是"+this.way+"\r\n"+"一共用时"+this.timeAmount+"\r\n"+"共花费了"+this.money+"元";
    }
}

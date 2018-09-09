package com.dinner.purchaseType;

import com.dinner.ChooseResult;

import java.util.Date;

public interface Purchase {
    public ChooseResult purchase(String timeAmount, String[] food, double money);
}

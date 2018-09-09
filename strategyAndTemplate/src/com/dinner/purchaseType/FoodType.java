package com.dinner.purchaseType;

public enum FoodType {
    DIV(new DIV()),RESTAURANT(new Restaurant()),TAKEOUTFOOD(new TakeOutFood());

    private Purchase purchase;

    FoodType(Purchase purchase){
        this.purchase=purchase;
    }
    public Purchase get(){
        return this.purchase;
    }
}

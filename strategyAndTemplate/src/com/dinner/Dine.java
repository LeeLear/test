package com.dinner;

import com.dinner.purchaseType.FoodType;

import java.awt.font.FontRenderContext;
import java.util.Date;

public class Dine {

    private Date timePoint;

    private String place;

    private String[] food;

    String timeAmount;
    double money;

    public String getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(String timeAmount) {
        this.timeAmount = timeAmount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public Dine() {
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(Date timePoint) {
        this.timePoint = timePoint;
    }

    public void dining(Date timePoint, String place, String[] food,FoodType name,double money){

        //1、选择时间
        this.setTimePoint(timePoint);
        //2、选择地点
        this.setPlace(place);
        //3、选择食物
        this.setFood(food);
        //4、食物来源的方式
        this.setMoney(money);
        ChooseResult cr=foodSource(name);

        System.out.println(cr);
        //5、处理后事
        System.out.println("倒进垃圾桶里");
    }

    public ChooseResult foodSource(FoodType foodType){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long timelong=new Date().getTime()-this.timePoint.getTime();
        this.setTimeAmount(String.valueOf(timelong/1000)+"秒");
        return foodType.get().purchase(this.timeAmount,this.food,this.money);
    }
}

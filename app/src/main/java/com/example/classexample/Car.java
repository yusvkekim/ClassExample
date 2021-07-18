package com.example.classexample;

public class Car {
    protected String info; //車の情報
    protected int speed; //車の速度
    //デフォルトコンストラクタ
    public Car() {
         this.info = "赤";
         this.speed = 0;
    }

    //コンストラクタ
    public Car(String color) {
        this.info = color;
        this.speed = 0;
    }

    //加速
    public void speedUp() {
        this.speed += 50;
    }

    //減速
    public void speedDown() {
        this.speed -= 50;
    }
}

package com.company;

public class Motorcycle extends Vehicle implements Costable {
    private int cost;
    private int maxSpeed;
    public Motorcycle (int wheelCount, int maxSpeed, int cost){
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
        this.cost = cost;


    }

    @Override
    public void printInfo() {
        System.out.println("Транспортное средство: Мотоцикт. Кол-во колес: " + this.wheelCount + ". Максимальная скорость: " + this.maxSpeed + "км/ч.");

    }

    @Override
    public void getCost() {
        System.out.println("Стоимость = " + this.cost);
    }
}

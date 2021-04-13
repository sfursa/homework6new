package com.company;

public class Motorcycle extends Vehicle implements Costable {
    private int maxSpeed;
    private int cost;
    private String model;

    public Motorcycle(int wheelCount, int maxSpeed, int cost, String model) {
        super(wheelCount);
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
        this.model = model;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспортное средство:" + "\n" +
                "МОТОЦИКЛ" + "\n" +
                "Модель - " + this.model + "\n" +
                "Кол-во колес: " + this.wheelCount + "\n" +
                "Максимальная скорость: " + this.maxSpeed + " км/ч");

    }

    @Override
    public int getCost() {
        System.out.println("Стоимость = " + cost + " USD");
        return cost;
    }
}

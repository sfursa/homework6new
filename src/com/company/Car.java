package com.company;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int cost;
    private String model;

    public Car(int wheelCount, int doorsCount, int cost, String model) {
        super(wheelCount);
        this.wheelCount = wheelCount;
        this.doorsCount = doorsCount;
        this.cost = cost;
        this.model = model;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспортное средство:" + "\n" +
                "АВТОМОБИЛЬ" + "\n" +
                "Модель -" + " " + this.model + "\n" +
                "Кол-во дверей: " + this.doorsCount + "\n" +
                "Кол-во колес: " + this.wheelCount);
    }

    @Override
    public int getCost() {
        System.out.println("Стоимость = $" + cost);
        return cost;
    }
}

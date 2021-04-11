package com.company;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private int cost;
    public Car(int wheelCount, int doorsCount, int cost){
        this.wheelCount = wheelCount;
        this.doorsCount = doorsCount;
        this.cost = cost;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспортное средство: Машина. Кол-во дверей: "+ this.doorsCount + ". Кол-во колес: " + this.wheelCount + ".");
    }

    @Override
    public void getCost() {
        System.out.println("Стоимость = " + this.cost);

    }
}

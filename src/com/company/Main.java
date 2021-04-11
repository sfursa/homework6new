package com.company;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(4, 5, 25000);
        Car BMV = new Car(4, 4, 30000);
        Motorcycle yamaha = new Motorcycle(2, 300, 10000);
        audi.printInfo();
        audi.getCost();
        System.out.println();
        BMV.printInfo();
        BMV.getCost();
        System.out.println();
        yamaha.printInfo();
        yamaha.getCost();
    }
}

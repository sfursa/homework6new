package com.company;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(4, 5, 25000, "Audi");
        Car BMW = new Car(4, 4, 30000, "BMW");
        Motorcycle yamaha = new Motorcycle(2, 300, 10000, "Yamaha");
        Motorcycle harley = new Motorcycle(3, 190, 16000, "Harley-Davidson");
        Motorcycle M1NSK = new Motorcycle(2,120,500,"M1NSK");

        audi.printInfo();
        audi.getCost();
        System.out.println();

        BMW.printInfo();
        BMW.getCost();
        System.out.println();

        yamaha.printInfo();
        yamaha.getCost();
        System.out.println();

        harley.printInfo();
        harley.getCost();
        System.out.println();

        M1NSK.printInfo();
        M1NSK.getCost();

    }
}

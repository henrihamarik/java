package com.company;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car lamborghini = new Car();
        bmw.setModel("e30");
        System.out.println("Model is " + bmw.getModel());
    }
}

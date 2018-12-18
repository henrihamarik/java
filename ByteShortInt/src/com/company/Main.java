package com.company;

public class Main {

    public static void main(String[] args) {

        byte myNewByte = 25;
        short myNewShort = 129;
        int myNewInt = 1456;
        long myNewLong = 5000L + 10L * (myNewByte + myNewShort + myNewInt);
        short shortTotal =(short) (1000 + 10* (myNewByte + myNewInt + myNewLong));
        System.out.println(myNewLong);
        System.out.println(shortTotal);
    }
}

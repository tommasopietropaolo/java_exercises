package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        Car ferrari = new Car();
        Car porsche = new Car();
        ferrari.setModel("testa rossa");
        System.out.println("Model is " + ferrari.getModel());
    }
}

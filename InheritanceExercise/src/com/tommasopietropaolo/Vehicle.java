package com.tommasopietropaolo;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDriection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDriection = 0;
    }

    public void steer(int direction){
        this.currentDriection += direction;
        System.out.println("Vehicles.steer(): Steering at " + currentDriection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDriection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDriection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDriection() {
        return currentDriection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}

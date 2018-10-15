package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog= new Dog("yorkie", 8,20,2,4,1,20,"logn silky");

        System.out.println("***********************************");

        dog.eat();
        System.out.println("xxxxxxxxxxxxxxxx");
        dog.walk();
        dog.run();

    }
}
